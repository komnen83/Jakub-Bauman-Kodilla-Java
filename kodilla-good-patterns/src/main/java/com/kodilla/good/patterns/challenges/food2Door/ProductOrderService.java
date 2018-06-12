package com.kodilla.good.patterns.challenges.food2Door;

public class ProductOrderService {

    private OrderRetrieve orderRetrieve;
    private ShopRepository shopRepository;

    public ProductOrderService(final OrderRetrieve orderRetrieve,
                               final ShopRepository shopRepository) {
        this.orderRetrieve = orderRetrieve;
        this.shopRepository = shopRepository;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = orderRetrieve.retrieve(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getShop());

        if(isOrdered) {
            shopRepository.process(orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}