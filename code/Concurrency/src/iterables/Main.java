package iterables;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Node tail = new Node(1, null);
        Node n1 = new Node(2, tail);
        Node n2 = new Node(3, n1);
        Node n3 = new Node(4, n2);
        Node n4 = new Node(5, n3);

//        while (n4 != null) {
//            System.out.println(n4.data);
//            n4 = n4.next;
//        }
        // Syntactic sugar
        for (int val: n4) {
            System.out.println(val);
        }

        Iterator itr = n4.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }




}
