import java.util.ArrayList;

public class InheritDemo {
    public static void main(String[] args) {

        GemoetricObject c = new Circle(8, "blue", true);

        try {
            Circle c1 = new Circle(3.5, "Blue", true);
        } catch (Exception e){
            System.out.println("Something went bad");
        } finally {
            System.out.println("Thanks for using this amazing program");
        }


        ArrayList<Circle> circles = new ArrayList<>();

        circles.add(new Circle(5, "blue", true));


//        demoStuff();
    }

    private static void demoStuff() {
        Circle c1 = new Circle(5, "blue", true);
        Circle c2 = new Circle(10, "black", false);
        Rectangle r1 = new Rectangle("red", false, 5,10);
        Rectangle r2 = new Rectangle("pink", true, 100, 198375019);

        report(c1);
        report(c2);
        report(r1);
        report(r2);

        compareEquality(c1, c2);
        compareEquality(r1, r2);
    }

    public static void report(Object o) {
        System.out.println(o.toString());
    }

    // How to then return if two objects are equivalent to each other
    public static void compareEquality(Object obj1, Object obj2) {
        if (obj1.equals(obj2)) {
            System.out.println("they are equivalent");
        } else {
            System.out.println("They are not equivalent");
        }
    }
//    public static void report(Circle c) {
//        System.out.println("--- Circle Report ---");
//        System.out.printf("\tColor: %s\n", c.getColor());
//        System.out.printf("\tFilled: %b\n", c.isFilled());
//        System.out.printf("\tRadius: %.2f\n", c.getRadius());
//        System.out.printf("\tArea: %.2f\n", c.getArea());
//        System.out.println(c.toString());
//    }

    public static void report(Rectangle r) {
        System.out.println("--- Circle Report ---");
        System.out.printf("\tColor: %s\n", r.getColor());
        System.out.printf("\tFilled: %b\n", r.isFilled());
        System.out.printf("\tWidth: %.2f\n", r.getWidth());
        System.out.printf("\tLength: %.2f\n", r.getLength());
        System.out.printf("\tArea: %.2f\n", r.getArea());
        System.out.println(r.toString());
    }
}