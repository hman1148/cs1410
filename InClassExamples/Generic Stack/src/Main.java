import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericStack<String> cities = new GenericStack<>();
        GenericStack<Integer> zipCodes = new GenericStack<>();

        cities.push("Paradise");
        cities.push("Nibley");
        cities.push("Logan");
        cities.push("Hype Park");

        while (!cities.isEmpty()) {
            System.out.println(cities.pop());
        }
        printArray(cities);
    }


    public static <E> void printArray(E[] array) {
        for (E item: array) {
            System.out.println(item);
        }
    }
}