package com.petmaps.aplication;

import com.petmaps.aplication.controllers.FirstController;
import com.petmaps.aplication.models.RefugioData;
import com.petmaps.aplication.models.UserData;
import com.petmaps.aplication.models.Usuario;
import com.petmaps.aplication.models.ValidarUser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {


    public static UserData userData = new UserData();
    public static RefugioData refugioData = new RefugioData();
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        scene=new Scene(loadFXML("login-view"));
        stage.setTitle("Login-petmaps");
        //stage.getIcons().add(new Image("src/main/resources/com/petmaps/aplication/assets/img/Petmapsicono.png"));
        stage.setScene(scene);
        stage.centerOnScreen();//centra la pantalla en tienpo de ejecución
        stage.setResizable(false);//impide que el usuario pueda modificar el tamaño del formulario
        stage.show();
    }
    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView));//sustituir en el objeto scene el archivo de vista
        stage.setResizable(true);//redimencionar stage true
        stage.sizeToScene();//renderiza el tamaño de stage con las dimensiones de la nueva vista
        stage.centerOnScreen();
        //stage.setResizable(false);
        stage.setTitle(title);
    }
    //com.petmaps.aplication.controllers.LoginController
    //com.petmaps.aplication.controllers.FirstController
    //com.petmaps.aplication.controllers.RegistroController
    //com.petmaps.aplication.controllers.MapsController
    //com.petmaps.aplication.controllers.MapasController
    //com.petmaps.aplication.controllers.NosotrosController
    //
    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView+".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {



        userData.AgregarUsuarios();
        refugioData.AgregarRefugios();

        launch();
    }
}