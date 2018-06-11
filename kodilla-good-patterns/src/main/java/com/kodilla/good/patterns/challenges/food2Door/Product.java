package com.kodilla.good.patterns.challenges.food2Door;

public class Product {

    String productName;
    int quantityOfProducts;

    public Product(String productName, int quantityOfProducts) {
        this.productName = productName;
        this.quantityOfProducts = quantityOfProducts;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }
}
