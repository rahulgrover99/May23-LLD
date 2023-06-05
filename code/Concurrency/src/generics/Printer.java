package generics;

public class Printer <T extends Number> {
    T objToPrint;

    public Printer(T objToPrint) {
        this.objToPrint = objToPrint;
    }

    public void print() {
        System.out.println(objToPrint);
        objToPrint.doubleValue();
    }
}
