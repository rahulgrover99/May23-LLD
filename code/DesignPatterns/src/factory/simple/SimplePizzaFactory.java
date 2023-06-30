package factory.simple;

import java.util.List;

// Factory responsible for creating Pizza instances.
public class SimplePizzaFactory {


    // Static factory.

    // You might want to avoid static factories, in case you want to override the
    // methods.
    static Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("Margarita")) {
            pizza = new Pizza("Margarita", "Normal", "Tomato", List.of());
        } else if (type.equals("Veggie")) {
            pizza = new Pizza("Veggie", "Thin", "Garlic", List.of("Onions", "Capsicum"));
        } else {
            pizza = new Pizza("Empty", "Normal", "Tomato", List.of());
        }
        return pizza;
    }

}
