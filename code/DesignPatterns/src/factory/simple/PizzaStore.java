package factory.simple;

import java.util.List;


// V1 -> We are only having 1 pizza that we prepare.
// PizzaStore is responsible for creating different Pizza instances.
public class PizzaStore {

    Pizza orderPizza(String type) {

        Pizza pizza;
        pizza = SimplePizzaFactory.createPizza(type);


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}


// 1. Dough and put some vegetables - whatever you want
// 2. Cheese, sauces.
// 3. Bake the pizza
// 4. Cut.
// 5. Box


// PizzaStore -> orderPizza() -> Pizza.





