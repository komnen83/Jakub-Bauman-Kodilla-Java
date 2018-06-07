package com.kodilla.good.patterns.challenges;

public class SportItemsPurchaseService implements PurchaseService{

    public boolean purchase(User user, Product product) {
        System.out.println("Buyer: " + user.getName() + " " + user.getSurname() + "Item: " + product.getProductName()
                + "Price: " + product.getProductPrice());
        return true;
    }
}
