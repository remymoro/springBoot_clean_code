package com.java.playground.solid.ocp;

public class AdminUser  implements  ApplicationUser{

    private  final   String name;

    public AdminUser(String name) {
        this.name = "administrator";
    }

    @Override
    public String getRole() {
        return "admin";
    }




}
