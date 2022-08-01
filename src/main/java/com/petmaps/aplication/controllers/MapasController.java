package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import com.petmaps.aplication.models.RefugioData;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MapasController{

RefugioData indexer = HelloApplication.refugioData;

public String VShow = "";



    @FXML
    private ImageView M;

    @FXML
    private Button btnInvisible1;


    @FXML
    private Button btnInvisible2;

    @FXML
    private Button btnInvisible3;

    @FXML
    private Button btnInvisible4;

    @FXML
    private Button btnInvisible5;

    @FXML
    private Button btnInvisible6;

    @FXML
    private Button btnInvisible7;

    @FXML
    private Button btnInvisible8;

    @FXML
    private Button btnVolverMaps;
    @FXML
    private Button btnPrintAll;

    @FXML
    private TextArea txtAreaShowCentroadopcion;

    @FXML
    private Button btnAgregarCentro;

    /*
    @FXML
    private Button btnAgregarTienda;
    */
    @FXML

    void btnInvisible1OnMouseClicked(MouseEvent event) {

        //Refugiobtn = String.valueOf(indexer.refugios.get(0));
        VShow = String.valueOf(indexer.Arrayrefugio.get(0));
        txtAreaShowCentroadopcion.setText(VShow);

    }

    @FXML
    void btnInvisible2OnMouseClicked(MouseEvent event) {

        VShow = String.valueOf(indexer.refugios.get(1));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible3OnMouseClicked(MouseEvent event) {

        VShow = String.valueOf(indexer.refugios.get(2));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible4OnMouseClicked(MouseEvent event) {
        VShow = String.valueOf(indexer.refugios.get(3));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible5OnMouseClicked(MouseEvent event) {
        VShow = String.valueOf(indexer.refugios.get(4));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible6OnMouseClicked(MouseEvent event) {
        VShow = String.valueOf(indexer.refugios.get(5));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible7OnMouseClicked(MouseEvent event) {
        VShow = String.valueOf(indexer.refugios.get(6));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnInvisible8OnMouseClicked(MouseEvent event) {
        VShow = String.valueOf(indexer.refugios.get(7));
        txtAreaShowCentroadopcion.setText(VShow);
    }

    @FXML
    void btnPrintAllOnMouseClicked(MouseEvent event) {

        String mostrartodo = String.valueOf(indexer.mostrarRefugios());
        txtAreaShowCentroadopcion.setText(mostrartodo);

    }
    @FXML
    void btnVolverMapsOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("First-view", "Menu Principal");
    }

    @FXML
    void btnAgregarCentroOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("RegistroCentro-view", "Registrar Centro");
    }
/*
    @FXML
    void btnAgregarTiendaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("registroTienda-view", "Registrar Tienda");
    }
*/

}
