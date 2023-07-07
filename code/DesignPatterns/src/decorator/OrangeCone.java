package decorator;

public class OrangeCone implements IceCream{

    IceCream iceCream;
    int cost = 10;
    String name = "Orange Cone";

    // Parameter less constructor for the base class.
    OrangeCone() {

    }

    OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null) return cost;
        return iceCream.getCost() + cost;
    }

    @Override
    public String getDescription() {
        if (iceCream == null) return name;
        return iceCream.getDescription() + name;
    }
}
