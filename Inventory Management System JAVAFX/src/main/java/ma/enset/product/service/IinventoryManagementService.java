package ma.enset.product.service;

import ma.enset.product.entities.Product;
import java.util.List;

public interface IinventoryManagementService {
    void addProduct(Product product) ;
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> searchProductByQuery(String query);
    Double CalculateStockValue();

}
