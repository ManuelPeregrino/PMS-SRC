package com.petmaps.aplication.controllers;
import com.petmaps.aplication.models.Refugio;
import com.petmaps.aplication.HelloApplication;
import com.petmaps.aplication.models.RefugioData;
import com.petmaps.aplication.models.UserData;
import com.petmaps.aplication.models.Usuario;
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
    private TextField txtRFCcentro;

    @FXML
    void btnAgregarDatosOnMouseClicked(MouseEvent event) {

        RefugioData refugioData = HelloApplication.refugioData;

        String NombreRefugio=(txtNombreCentro.getText());
        String Ubicacion =(txtUbicacionCentro.getText());
        String rfc =(txtRFCcentro.getText());
        String capacidad = (txtCapacidadCentro.getText());
        int Capacidad = Integer.valueOf(capacidad);


        byte SIZE = (byte) refugioData.refugios.size();
        System.out.println(SIZE);
        if(NombreRefugio!=""&&rfc!=""&&Ubicacion!=""&&capacidad!=""){

            refugioData.refugios.add(new Refugio(NombreRefugio,rfc, Ubicacion, Capacidad));
            if(refugioData.refugios.size()!=SIZE){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Refugios - Error");
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
        HelloApplication.setFXML("mapas-view", "Mapas");
    }

}
