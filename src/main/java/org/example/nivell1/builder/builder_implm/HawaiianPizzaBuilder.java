package org.example.nivell1.builder.builder_implm;

import org.example.nivell1.builder.PizzaBuilder;
import org.example.nivell1.model.Pizza;

import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private double size;
    private String dough;
    private List<String> toppings;

    @Override
    public void setPizzaSize(double size) {
        this.size = size;
    }

    @Override
    public void setPizzaDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setPizzaToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public double getPizzaSize() {
        return this.size;
    }

    @Override
    public String getPizzaDough() {
        return this.dough;
    }

    @Override
    public List<String> getPizzaToppings() {
        return this.toppings;
    }

    @Override
    public String toString() {
        return "HawaiianPizzaBuilder{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
