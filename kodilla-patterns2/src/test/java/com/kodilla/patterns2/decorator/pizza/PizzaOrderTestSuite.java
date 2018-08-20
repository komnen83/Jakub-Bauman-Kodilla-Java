package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza with dough, tomato sauce and cheese", description);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza with dough, tomato sauce and cheese + pepperoni", description);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniAndExtraCheeseGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza with dough, tomato sauce and cheese + pepperoni + extra cheese", description);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniBigosAndExtraCheeseGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new BigosDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(21), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithPepperoniBigosAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PepperoniDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new BigosDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza with dough, tomato sauce and cheese + pepperoni + extra cheese + bigos", description);
    }
}