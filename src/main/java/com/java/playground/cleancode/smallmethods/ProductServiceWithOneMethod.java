package com.java.playground.cleancode.smallmethods;


public class ProductServiceWithOneMethod {

        public Product createProduct(String name, double price, int quantity) {
            // Step 1: Validate input parameters
            if (name == null || name.isEmpty() || price <= 0 || quantity < 0) {
                throw new IllegalArgumentException("Invalid input parameters");
            }

            // Step 2: Create a new product
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);

            // Step 3: Calculate the total cost
            double totalCost = price * quantity;

            // Step 4: Save the product to the database
            if (totalCost > 100.0) {
                // Perform some special logic for high-cost products
                product.setIsHighCost(true);
            }

            // Step 5: Generate a unique product code
            String productCode = generateProductCode(name, quantity);
            product.setProductCode(productCode);

            // Step 6: Save the product to the database
            if (totalCost > 100.0) {
                // Perform some more database-related operations
            } else {
                // Perform a different set of database-related operations
            }

            return product;
        }

        private String generateProductCode(String name, int quantity) {
            // Complex logic for generating a unique product code
            // ...
            return "PROD12345";
        }
    }

