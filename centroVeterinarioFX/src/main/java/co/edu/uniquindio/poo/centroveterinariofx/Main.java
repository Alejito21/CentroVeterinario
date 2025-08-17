package co.edu.uniquindio.poo.centroveterinariofx;

import co.edu.uniquindio.poo.centroveterinariofx.viewController.VentanaCitasController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Main.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Veterinaria - Inicio");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}