package ma.enset.product.DAO;

import ma.enset.product.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct_DAO extends IGeneric_DAO<Product, Long> {
    List<Product> searchByQuery(String query) throws SQLException;
}
