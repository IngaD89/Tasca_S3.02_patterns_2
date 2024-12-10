package org.example.nivell1;


import org.example.nivell1.builder.MasterPizzer;
import org.example.nivell1.builder.PizzaBuilder;
import org.example.nivell1.builder.builder_implm.HawaiianPizzaBuilder;
import org.example.nivell1.builder.builder_implm.VegetarianPizzaBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        hawaiianPizzaBuilder.setPizzaSize(31);
        hawaiianPizzaBuilder.setPizzaDough("Thin");
        hawaiianPizzaBuilder.setPizzaToppings(Arrays.asList("cheese", "tomato", "ham", "pineapple"));

        MasterPizzer hawaiianPizza = new MasterPizzer(hawaiianPizzaBuilder);

        System.out.println(hawaiianPizza);

        PizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();

        vegetarianPizzaBuilder.setPizzaSize(42);
        vegetarianPizzaBuilder.setPizzaDough("Thin");
        vegetarianPizzaBuilder.setPizzaToppings(Arrays.asList("Cheese", "Tomato", "Honey", "Eggplant"));

        MasterPizzer vegetarianPizza = new MasterPizzer(vegetarianPizzaBuilder);

        System.out.println(vegetarianPizza);
    }
}
