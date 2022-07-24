package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import com.petmaps.aplication.models.Usuario;
import com.petmaps.aplication.models.ValidarUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    ValidarUser user = new ValidarUser();

    @FXML
    private Button btnIniciar;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnIniciaOnMouseClicked(MouseEvent event) {

        if(user.autenticarUsers(txtUsername.getText(), txtPassword.getText())){
            HelloApplication.setFXML("First-view", "Menu Principal");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login- Info");
            alert.setContentText("Bienvenido al sistema");
            alert.showAndWait();*/
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }
    }

    @FXML
    void btnRegistrarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("registro-view", "Registro");
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}
