package org.example.nivell1.builder;

public class MasterPizzer {

    private PizzaBuilder builder;

    public MasterPizzer(PizzaBuilder builder) {
        this.builder = builder;
    }

    @Override
    public String toString() {
        return "MasterPizzer{" +
                "size=" + builder.getPizzaSize() +
                " dough=" + builder.getPizzaDough() +
                " toppings=" + builder.getPizzaToppings() +
                '}';
    }
}
