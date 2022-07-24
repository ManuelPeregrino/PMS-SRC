
//Codigo de ejemplo eliminar si es nesesario

package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class NosotrosController {

    @FXML
    private ImageView M;

    @FXML
    private Button btnVolverMaps;

    @FXML
    void btnVolverMapsOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("First-view", "Menu Principal");
    }

}
