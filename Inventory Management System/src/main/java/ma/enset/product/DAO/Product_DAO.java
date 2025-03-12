package ma.enset.product.DAO;

import ma.enset.product.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Product_DAO implements IProduct_DAO {

    @Override
    public void Create(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("INSERT INTO product(Name,Qty,Price)" +
                "VALUES (?,?,?)");
        preparedstatement.setString(1, product.getName());
        preparedstatement.setInt(2, product.getQuantity());
        preparedstatement.setDouble(3, product.getPrice());
        preparedstatement.executeUpdate();
    }

    @Override
    public void Update(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("UPDATE product SET Name=?,Qty=?, Price=? WHERE Id=?");
        preparedstatement.setString(1, product.getName());
        preparedstatement.setInt(2, product.getQuantity());
        preparedstatement.setDouble(3, product.getPrice());
        preparedstatement.setLong(4,product.getProductid());
        preparedstatement.executeUpdate();

    }

    @Override
    public void Delete(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("DELETE FROM product WHERE Id=?");
        preparedstatement.setLong(1, product.getProductid());
        preparedstatement.executeUpdate();
    }

    @Override
    public List<Product> getAll() throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("SELECT * FROM product ");
        ResultSet resultSet = preparedstatement.executeQuery();
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            Product product = new Product();
            product.setProductid(resultSet.getLong("Id"));
            product.setName(resultSet.getString("Name"));
            product.setQuantity(resultSet.getInt("Qty"));
            product.setPrice(resultSet.getDouble("Price"));
            products.add(product);
        }
        return products ;
    }

    @Override
    public Product getById(Long id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("SELECT * FROM product WHERE Id=?");
        preparedstatement.setLong(1, id);
        ResultSet resultSet = preparedstatement.executeQuery();
        Product product = new Product();
        if (resultSet.next()) {
            product.setProductid(resultSet.getLong("Id"));
            product.setName(resultSet.getString("Name"));
            product.setQuantity(resultSet.getInt("Qty"));
            product.setPrice(resultSet.getDouble("Price"));
        }
        return product;
    }

    @Override
    public List<Product> searchByQuery(String query) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedstatement = connection.prepareStatement("SELECT * FROM product WHERE Name LIKE ? ");
        preparedstatement.setString(1, "%" + query + "%");
        ResultSet resultSet = preparedstatement.executeQuery();
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            Product product = new Product();
            product.setProductid(resultSet.getLong("Id"));
            product.setName(resultSet.getString("Name"));
            product.setQuantity(resultSet.getInt("Qty"));
            product.setPrice(resultSet.getDouble("Price"));
            products.add(product);
        }
        return products ;
    }
}
