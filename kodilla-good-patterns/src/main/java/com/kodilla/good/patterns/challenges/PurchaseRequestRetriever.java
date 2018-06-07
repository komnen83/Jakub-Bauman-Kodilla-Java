package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {

        User user = new User("Rocky", "Balboa\n");
        Product product = new Product("Boxing gloves\n", 299.99);

        return new PurchaseRequest(user, product);
    }
}
