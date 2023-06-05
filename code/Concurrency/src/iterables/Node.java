package iterables;

import java.util.ArrayList;
import java.util.Iterator;

public class Node implements Iterable<Integer> {

    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }

    static class NodeIterator implements Iterator<Integer> {

        private Node node;

        NodeIterator(Node node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {

            if (node == null) {
                return false;
            } else {
                return true;
            }

        }

        @Override
        public Integer next() {
            Integer val = node.data;
            node = node.next;
            return val;
        }
    }
}
