package decorator;

public class VanillaScoop implements IceCream{
    IceCream iceCream;
    int cost = 25;
    String name = "Vanilla Scoop";

    VanillaScoop(IceCream iceCream) {
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