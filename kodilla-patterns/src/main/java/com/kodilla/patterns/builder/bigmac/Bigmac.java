package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder setIngredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Create your Bigmac\n" +
                "Bun = '" + bun + '\'' + "\n" +
                "Quantity of burgers = " + burgers + "\n" +
                "Sauce = '" + sauce + '\'' + "\n" +
                "Ingredients = " + ingredients;
    }
}
