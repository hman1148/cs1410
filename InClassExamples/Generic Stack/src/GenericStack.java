import java.util.ArrayList;

public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E peek() {
        return list.get(getSize() - 1); // E returns the type of element that is inputted into the list
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        E top = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return top;
    }


}
