package com.java.playground.solid.ocp;




// ocp - Open Close Principle
//on doit pouvoir ajouter de nouvelles fonctionnalités sans modifier le code existant

public class User {


    public  String name;
    public  String type;


    public User(String name) {
        this.name = name;
    }




// à chaque fois qu'on veut ajouter un nouveau type d'utilisateur, on doit modifier cette classe

    public String getRole(){
        return switch (this.type) {
            case "admin" -> "admin";
            case "user" -> "user";
            default -> "Unknown ";
        };
    }
}
