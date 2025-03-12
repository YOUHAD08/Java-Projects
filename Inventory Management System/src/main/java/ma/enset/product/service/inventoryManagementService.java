package ma.enset.product.service;

import ma.enset.product.DAO.IProduct_DAO;
import ma.enset.product.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class inventoryManagementService implements IinventoryManagementService{

    private IProduct_DAO product_DAO;

    public inventoryManagementService(IProduct_DAO product_DAO) {
        this.product_DAO = product_DAO;
    }

    @Override
    public void addProduct(Product product) {
        try {
            product_DAO.Create(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            product_DAO.Update(product);
        } catch (SQLException e) {
            e.printStackTrace();;
        }
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            product_DAO.Delete(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product getProductById(Long id) {
        Product product = new Product();
        try {
            product= product_DAO.getById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            products = product_DAO.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public List<Product> searchProductByQuery(String query) {
        List<Product> products = new ArrayList<>();
        try {
            products = product_DAO.searchByQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return products ;
    }

    @Override
    public Double CalculateStockValue() {
        double StockValue = 0;
        List<Product> products = getAllProducts();
        for (Product product : products) {
            StockValue += product.getPrice()*product.getQuantity();
        }
        return StockValue;
    }
}
