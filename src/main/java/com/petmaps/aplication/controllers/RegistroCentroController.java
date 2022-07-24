package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class RegistroCentroController {

    @FXML
    private ImageView M;

    @FXML
    private Button btnAgregarDatos;

    @FXML
    private Button btnRegresar;

    @FXML
    private AnchorPane btnSalir;

    @FXML
    private TextField txtCapacidadCentro;

    @FXML
    private TextField txtNombreCentro;

    @FXML
    private TextField txtUbicacionCentro;

    @FXML
    void btnAgregarDatosOnMouseClicked(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Trabajo en proceso");
        alert.setContentText("Lo sentimos \n El boton no ha sido implementado...");
        alert.showAndWait();
    }

    @FXML
    void btnRegresarOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("mapas-view", "Mapas");
    }

}
