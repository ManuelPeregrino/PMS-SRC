package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;



public class FirstController {


    @FXML
    private ImageView M;


    @FXML
    private Button btnMaps;
    @FXML
    private Button btnNosotros;
    @FXML
    private Button btnRegresarALogin;


    @FXML
    private Button btnServicios;

    @FXML
    void btnMapsOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("mapas-view", "Mapas");
    }

    @FXML
    void btnNosotrosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("nosotros-view", "Sobre Nosotros");
    }


    @FXML
    void btnServiciosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("login-view", "Inicio");
    }
}
