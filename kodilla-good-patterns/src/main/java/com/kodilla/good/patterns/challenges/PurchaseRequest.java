package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {

    private User user;
    private Product product;

    public PurchaseRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
