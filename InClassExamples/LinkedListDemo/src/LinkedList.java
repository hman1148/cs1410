import java.util.List;

public class LinkedList<E extends Comparable<E>> {


    private ListNode<E> head = new ListNode<E>();
    private int size;


    public int getSize() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insert(E value) {
        ListNode<E> node = new ListNode<>(value); // steps 1 and 2
        ListNode<E> current = head.next;
        ListNode<E> previous = head;

        while (current != null && current.value.compareTo(value) < 0) {
            previous = current;
            current = current.next;
        }
        previous.next = node;
        node.next = current;
    }

    public void display() {
        ListNode<E> current = head.next;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    private class ListNode<E> {
        public E value;
        public ListNode<E> next;
        public ListNode() {}
        public ListNode(E o) {
            this.value = o;
        }
    }

    public void remove(E value) {
        ListNode<E> node = head.next;
        ListNode<E> previous = head;

        while (node.value.compareTo(value) != 0) {
            previous = node;
            node = node.next;
        }
        previous.next = node.next;
    }
}

