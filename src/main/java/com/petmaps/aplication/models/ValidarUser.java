package com.petmaps.aplication.models;

import com.petmaps.aplication.HelloApplication;

import java.util.ArrayList;

public class ValidarUser {

    UserData userData = HelloApplication.userData;
    public boolean autenticarUsers(String username, String password){
        boolean status=false;
        Usuario user = findUser(username);

        if (user !=null && user.getPassword().equals(password)){
            status=true;
            return status;
        }
            return false;
    }
    private Usuario findUser(String username){
        Usuario user=null;
        boolean status=false;
        int index=0;
        while(!status && index<userData.users.size()){
            if(userData.users.get(index).getUsername().equals(username)){
                user=userData.users.get(index);
                status=true;
            }
            index++;
        }
        return user;

    }

}
