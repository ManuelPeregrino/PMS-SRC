package com.petmaps.aplication.models;

public interface Validaciones {

    boolean autenticarUsers(String username, String password);
    public  Usuario findUser(String username);

}
