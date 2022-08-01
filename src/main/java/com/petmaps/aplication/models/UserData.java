package com.petmaps.aplication.models;

import java.util.ArrayList;

public class UserData {

    public ArrayList<Usuario> users = new ArrayList<>();

    public void AgregarUsuarios(){

        users.add(new Usuario("Admin", "myadmin@gmail.com", "Admin"));

    }

    public boolean NuevoUsuario(String Nombre,String Username, String Password){
        users.add(new Usuario(Nombre, Username, Password));
        return true;
    }



}
