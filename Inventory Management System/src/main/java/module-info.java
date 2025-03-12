module ma.enset.product {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ma.enset.product to javafx.fxml;
    exports ma.enset.product;
    exports ma.enset.product.Controllers;
    opens ma.enset.product.entities to javafx.base;
    opens ma.enset.product.Controllers to javafx.fxml;
}