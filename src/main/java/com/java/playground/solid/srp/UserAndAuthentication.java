package com.java.playground.solid.srp;




// srp - Single Responsibility Principle

// cette classe viole le prince de responsabilité unique car elle a deux responsabilités
// 1. Enregistrer un utilisateur
// 2. Authentifier un utilisateur
// Il est préférable de séparer ces deux responsabilités en deux classes distinctes
public class UserAndAuthentication {

    public String username;
    public String password;



    public void saveUser(){

    }


    public boolean authenticateUser(){
        return false;
    }


}
