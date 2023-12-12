import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Paradise");
        cities.add("Welsville");
        cities.add("Logan");
        cities.add("Nilbey");
        cities.add("Logan");
        cities.add("Smithfield");
        cities.add("Clarkston");


        for (var city: cities) {
            System.out.println(city);
        }
        cities.set(0, "Hyrum");
    }
}