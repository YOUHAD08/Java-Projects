package ma.enset.product.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;
    static {
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management","root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
