package com.java.playground.cleancode.comments;

public class UserProcessorWithComments {

    /**
     * Processes user data by validating the input and then processing it if valid.
     *
     * @param name  User's name, should not be null or empty
     * @param age   User's age, should be between 18 and 99
     * @param email User's email, should contain '@' and not be null
     */
    public void processUserData(String name, int age, String email) {
        // Check if the name is not empty
        if (name != null && !name.isEmpty()) {
            // Check if the age is within the specified range
            if (age >= 18 && age <= 99) {
                // Check if the email is valid (not null and contains '@')
                if (email != null && email.contains("@")) {
                    // All checks passed, proceed with data processing
                    System.out.println("Data processed successfully");
                } else {
                    // Handling the case where the email is invalid
                    System.out.println("Invalid email address");
                }
            } else {
                // Handling the case where the age is invalid
                System.out.println("Invalid age");
            }
        } else {
            // Handling the case where the name is empty
            System.out.println("Name cannot be empty");
        }
    }
}
