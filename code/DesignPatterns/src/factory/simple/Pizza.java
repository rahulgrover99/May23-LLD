package factory.simple;

import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings;

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Kneading dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings: ");
        for(String topping: toppings) {
            System.out.println(topping);
        }
    }

    void bake() {
        System.out.println("Baking pizza at 350 degrees for 10 minutes.");
    }

    void cut() {
        System.out.println("Cutting the pizza in diagnol slices.");
    }

    void box() {
        System.out.println("Placing pizza in official PizzaStore box.");
    }

    String getName() {
        return name;
    }

}
