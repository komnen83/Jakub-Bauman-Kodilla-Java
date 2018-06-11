package com.kodilla.good.patterns.challenges.food2Door;

public class OrderRequest {

    private Customer customer;
    private Product product;
    private Shop shop;

    public OrderRequest(Customer customer, Product product, Shop shop) {
        this.customer = customer;
        this.product = product;
        this.shop = shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Shop getShop() {
        return shop;
    }
}
