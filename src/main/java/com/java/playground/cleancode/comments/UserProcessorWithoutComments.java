package com.java.playground.cleancode.comments;

public class UserProcessorWithoutComments {

    public void processUserData(String name, int age, String email) {
        if (isNameValid(name) && isAgeValid(age) && isEmailValid(email)) {
            System.out.println("Data processed successfully");
        }
    }

    private boolean isNameValid(String name) {
        if (name != null && !name.isEmpty()) {
            return true;
        } else {
            System.out.println("Name cannot be empty");
            return false;
        }
    }

    private boolean isAgeValid(int age) {
        if (age >= 18 && age <= 99) {
            return true;
        } else {
            System.out.println("Invalid age");
            return false;
        }
    }

    private boolean isEmailValid(String email) {
        if (email != null && email.contains("@")) {
            return true;
        } else {
            System.out.println("Invalid email address");
            return false;
        }
    }
}
