package com.kodilla.good.patterns.challenges.food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Customer customer = new Customer("John Wick");
        Product product = new Product("Lard", 1000);
        Shop shop = new Shop("Healthy Shop");

        return new OrderRequest(customer, product, shop);
    }
}
