package com.java.playground.cleancode.smallmethods;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private double totalCost;
    private boolean isHighCost;
    private String productCode;

    // Constructor
    public Product() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean getIsHighCost() {
        return isHighCost;
    }

    public void setIsHighCost(boolean isHighCost) {
        this.isHighCost = isHighCost;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
