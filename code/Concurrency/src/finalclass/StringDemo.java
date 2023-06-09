package finalclass;

public class StringDemo {

    public static void main(String[] args) {

        // String are stored in String Constant Pool
        // Strings are Immutable.
        // Security
        // Thread Safety (since multiple reads)
        // Saves space.

        // Both x and y --> refer to the same strings that are stored in SCP

        final String rahul = new String("Rahul");

        String x = "Rahul";
        String y = "Rahul";

//        y += "hehe";

//        System.out.println(x + y);

        String z = "Rahul";

        System.out.println(z);


        StringBuilder stringBuilder = new StringBuilder("Rahul");
        System.out.println(stringBuilder);
        stringBuilder.append("12");
        System.out.println(stringBuilder);


//        StringBuffer



    }
}
