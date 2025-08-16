package co.edu.uniquindio.poo.centroveterinariofx.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class VentanaGestionController {
    @FXML
    public void abrirMascotas(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Mascota.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Gestión Mascotas");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void abrirPropietarios(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Propietarios.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Gestión Propietarios");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void abrirVeterinarios(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Veterinario.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Gestión Veterinarios");
        stage.setScene(scene);
        stage.show();
    }
}
