package com.kodilla.good.patterns.challenges.food2Door;

public class Application {
    public static void main(String args[]) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new OrderRequest());

        productOrderService.order(orderRequest);

    }
}
