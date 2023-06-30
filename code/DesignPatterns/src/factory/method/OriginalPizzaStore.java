package factory.method;

import factory.simple.Pizza;

import java.util.List;

public class OriginalPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return new Pizza("Margarita", "Normal", "Tomato", List.of());
    }
}
