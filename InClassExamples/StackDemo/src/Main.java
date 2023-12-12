public class Main {
    public static void main(String[] args) {

        Stack<String> cities = new Stack<>();

        cities.push("Paradies");
        cities.push("Wellsville");
        cities.push("Hyrum");
        cities.push("Nibley");
        cities.push("Logan");
        cities.push("Benson");
        cities.push("Amalga");
        cities.push("Newton");


        System.out.println("--- Remove From Stack ---");
        while (!cities.isEmpty()) {
            // pop things off the stack
            System.out.println(cities.pop());
        }

    }
}