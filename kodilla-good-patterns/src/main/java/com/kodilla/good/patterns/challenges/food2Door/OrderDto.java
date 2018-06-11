package com.kodilla.good.patterns.challenges.food2Door;

public class OrderDto {

    private Customer customer;
    private boolean isOrdered;

    public OrderDto(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }
}
