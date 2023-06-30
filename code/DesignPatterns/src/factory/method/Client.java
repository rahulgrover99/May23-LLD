package factory.method;

public class Client {

    public static void main(String[] args) {
        PizzaStore originalPizzaStore = new OriginalPizzaStore();
        originalPizzaStore.orderPizza("M");

        PizzaStore newPizzaStore = new NYPizzaStore();
        newPizzaStore.orderPizza("M");

    }


}
