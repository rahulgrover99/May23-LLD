package decorator;

public class Client {


    public static void main(String[] args) {
        IceCream iceCream = new VanillaScoop(new ChocolateSyrup(new OrangeCone()));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }


}
