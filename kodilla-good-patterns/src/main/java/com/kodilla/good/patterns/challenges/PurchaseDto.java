package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    public User user;
    public boolean isOrdered;

    public PurchaseDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
