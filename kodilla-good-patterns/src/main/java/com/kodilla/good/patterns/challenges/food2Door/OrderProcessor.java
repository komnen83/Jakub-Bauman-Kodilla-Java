package com.kodilla.good.patterns.challenges.food2Door;

public class OrderProcessor {

    private OrderProcess orderProcess;
    private InformationService informationService;

    public OrderProcessor(final OrderProcess orderProcess, final InformationService informationService) {
        this.orderProcess = orderProcess;
        this.informationService = informationService;
    }
}
