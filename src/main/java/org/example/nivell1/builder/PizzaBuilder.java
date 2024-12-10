package org.example.nivell1.builder;

import org.example.nivell1.model.Pizza;

import java.util.List;

public interface PizzaBuilder {
    void setPizzaSize(double size);
    void setPizzaDough(String dough);
    void setPizzaToppings(List<String> toppings);

    double getPizzaSize();
    String getPizzaDough();
    List<String> getPizzaToppings();

}
