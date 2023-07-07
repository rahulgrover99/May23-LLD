package decorator;

public class ChocolateSyrup implements IceCream {
    IceCream iceCream;
    int cost = 15;
    String name = "Chocolate Syrup";

    ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + name;
    }
}