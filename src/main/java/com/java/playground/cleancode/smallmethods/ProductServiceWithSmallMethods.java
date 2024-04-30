package com.java.playground.cleancode.smallmethods;

public class ProductServiceWithSmallMethods {

        public Product createProduct(String name, double price, int quantity) {
            validateInputParameters(name, price, quantity);
            Product product = createBasicProduct(name, price, quantity);
            calculateTotalCost(product);
            setSpecialProperties(product);
            generateProductCode(product);
            saveProductToDatabase(product);
            return product;
        }

        private void validateInputParameters(String name, double price, int quantity) {
            if (name == null || name.isEmpty() || price <= 0 || quantity < 0) {
                throw new IllegalArgumentException("Invalid input parameters");
            }
        }

        private Product createBasicProduct(String name, double price, int quantity) {
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            return product;
        }

        private void calculateTotalCost(Product product) {
            double totalCost = product.getPrice() * product.getQuantity();
            product.setTotalCost(totalCost);
        }

        private void setSpecialProperties(Product product) {
            if (product.getTotalCost() > 100.0) {
                product.setIsHighCost(true);
            }
        }

        private void generateProductCode(Product product) {
            String productCode = generateUniqueProductCode(product.getName(), product.getQuantity());
            product.setProductCode(productCode);
        }

        private void saveProductToDatabase(Product product) {
            if (product.getTotalCost() > 100.0) {
                // Perform some more database-related operations for high-cost products
            } else {
                // Perform database-related operations for regular-cost products
            }
        }

        private String generateUniqueProductCode(String name, int quantity) {
            // Complex logic for generating a unique product code
            // ...
            return "PROD12345";
        }
    }



