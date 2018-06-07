package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new SportItemsPurchaseService(),
                new SmallItemsPurchaseRepository());

        productOrderService.process(purchaseRequest);
    }
}
