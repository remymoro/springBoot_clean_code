package com.java.playground.solid.ocp;

public class VisitorUser implements ApplicationUser{


    private  final  String name;

    public VisitorUser(String name) {
        this.name = "visitor";


    }

    @Override
    public String getRole() {
        return "visitor";
    }
}
