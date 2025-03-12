package ma.enset.product;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Product_View.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 420);
        stage.setScene(scene);
        stage.setTitle("Inventory Management System ");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
