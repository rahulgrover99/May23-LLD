package factory.method;

import factory.simple.Pizza;

import java.util.List;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("Mushroom")) {
            pizza = new Pizza("Mushroom", "Normal", "Tomato", List.of());
        } else if (type.equals("Veggie")) {
            pizza = new Pizza("Cheese", "Thick", "Garlic", List.of("Onions", "Capsicum"));
        } else {
            pizza = new Pizza("NYSpecial", "Normal", "Tomato", List.of());
        }
        return pizza;
    }
}
