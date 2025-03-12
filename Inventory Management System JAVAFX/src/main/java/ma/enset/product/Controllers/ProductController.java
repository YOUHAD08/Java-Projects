package ma.enset.product.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import ma.enset.product.DAO.Product_DAO;
import ma.enset.product.entities.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import ma.enset.product.service.IinventoryManagementService;
import ma.enset.product.service.inventoryManagementService;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable {

    @FXML public TextField TextFieldName;
    @FXML public TextField TextFieldPrice;
    @FXML public TextField TextFieldQty;
    @FXML public TextField TextFieldSearch;
    @FXML public TableView<Product> tableProducts;
    @FXML public TableColumn<Product,Long> ColumnId;
    @FXML public TableColumn<Product,String> ColumnName;
    @FXML public TableColumn<Product,String> ColumnQty;
    @FXML public TableColumn<Product,String> ColumnPrice;
    @FXML public Label StockValue;

    private ObservableList<Product> products = FXCollections.observableArrayList();
    private IinventoryManagementService inventorymanagementservice ;
    private Product selectedProduct ;

    public void AddProduct() {

        String name = TextFieldName.getText();
        String qty = TextFieldQty.getText();
        String  price = TextFieldPrice.getText();



        if (name .isEmpty()|| price.isEmpty()|| qty.isEmpty())  {
            showAlert("Error", "Please fill all the fields");
        }
        else {
            Product product = new Product(name, Integer.parseInt(qty), Double.parseDouble(price));
            inventorymanagementservice.addProduct(product);

            products.setAll(inventorymanagementservice.getAllProducts());
            clearFields();
        }

    }
    public void DeleteProduct() {
        Product product = tableProducts.getSelectionModel().getSelectedItem();
        if (product == null) {
            showAlert("Error", "No product selected");
        }
        else {
            inventorymanagementservice.deleteProduct(product);
            products.setAll(inventorymanagementservice.getAllProducts());
            clearFields();

        }
    }
    public void UpdateProduct() {
        if (selectedProduct == null) {
            showAlert("Product not found", "Please select a Product");
        }
        else {
            selectedProduct.setName(TextFieldName.getText());
            selectedProduct.setQuantity(Integer.parseInt(TextFieldQty.getText()));
            selectedProduct.setPrice(Double.parseDouble(TextFieldPrice.getText()));

            inventorymanagementservice.updateProduct(selectedProduct);
            products.setAll(inventorymanagementservice.getAllProducts());
            clearFields();
        }
    }


    public void CalculateStockValue() {
        StockValue.setText(inventorymanagementservice.CalculateStockValue() + " $ ");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
    private void clearFields() {
        TextFieldName.clear();
        TextFieldPrice.clear();
        TextFieldQty.clear();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inventorymanagementservice = new inventoryManagementService(new Product_DAO());

        ColumnId.setCellValueFactory(new PropertyValueFactory<>("productid"));
        ColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColumnQty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        ColumnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        products.setAll(inventorymanagementservice.getAllProducts());

        tableProducts.setItems(products);

        TextFieldSearch.textProperty().addListener((observable, oldValue, newValue) -> {
            products.setAll(inventorymanagementservice.searchProductByQuery(newValue)) ;
        });
        tableProducts.getSelectionModel().selectedItemProperty().addListener((observable, oldValueProduct, newValueProduct) -> {
            if( newValueProduct!= null) {

                TextFieldName.setText(newValueProduct.getName());
                TextFieldPrice.setText(String.valueOf(newValueProduct.getPrice()));
                TextFieldQty.setText(String.valueOf(newValueProduct.getQuantity()));
                selectedProduct=newValueProduct;
            }
        });
    }
    }
