package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;

import com.petmaps.aplication.models.UserData;
import com.petmaps.aplication.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class RegistroController {

    @FXML
    private ImageView M;

    @FXML
    private Button btnAgregarDatos;

    @FXML
    private Button btnRegresar;

    @FXML
    private AnchorPane btnSalir;

    @FXML
    private TextField txtContraseña;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtTelefono;

    @FXML
    void btnAgregarDatosOnMouseClicked(MouseEvent event) {

        UserData userData = HelloApplication.userData;

        String NombreUsuario=(txtNombreUsuario.getText());
        String CorreoUsuario=(txtCorreo.getText());
        String ContrasenaUsuario=(txtContraseña.getText());

        byte SIZE = (byte) userData.users.size();
        System.out.println(SIZE);
        if(NombreUsuario!=""&&CorreoUsuario!=""&&ContrasenaUsuario!=""){

            userData.users.add(new Usuario(NombreUsuario,CorreoUsuario, ContrasenaUsuario));
            if(userData.users.size()!=SIZE){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Login - Error");
                alert.setContentText("Registro Completado con exito");
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("Error\n Dejo algun espacio en blanco");
            alert.showAndWait();
        }
    }

    @FXML
    void btnRegresarOnMouseCliked(MouseEvent event) {
        HelloApplication.setFXML("login-view", "Login");
    }

}

