package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun("Bun with sesame")
                .setBurgers(3)
                .setSauce("BBQ")
                .setIngredient("Onion")
                .setIngredient("Becon")
                .setIngredient("Cheese")
                .build();
        System.out.println(bigmac);

        Assert.assertEquals(3, bigmac.getIngredients().size());

    }
}
