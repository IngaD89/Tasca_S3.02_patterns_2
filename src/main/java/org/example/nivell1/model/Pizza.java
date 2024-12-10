package org.example.nivell1.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private double size;
    private String dough;
    private List<String> toppings;

    public Pizza(double size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
