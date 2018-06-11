package com.kodilla.good.patterns.challenges.food2Door;

public class OrderDto  {

        public Provider provider;
        public boolean isOrdered;

    public OrderDto(Provider provider, boolean isOrdered) {
        this.provider = provider;
        this.isOrdered = isOrdered;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
