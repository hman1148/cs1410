public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(6);

        System.out.printf("The area of a circle with radius: %.2f is %.4f\n", c1.getRadius(), c1.getArea());
        System.out.printf("The area of a circle with radius: %.2f is %.4f\n", c2.getRadius(), c2.getArea());
        System.out.printf("This many circles created %d \n", Circle.getNumberCreated()); // example of what you can do with static variables and methods


        report(c1);
        report(c2);
        doubleRadius(c1);
        doubleRadius(c2);
        report(c1);
        report(c2);

    }

    public static void report(Circle c) {
        System.out.print("--- Circle Report --- \n");
        System.out.printf("Radius : %f\n", c.getRadius());
        System.out.printf("Diameter: %f\n", c.getDiameter());
        System.out.println();
    }

    public static void doubleRadius(Circle c) {
        c.setRadius(2 * c.getRadius());
    }

    public static void demoArrayOfObjects(){
        int[] myData = new int[10];

        Circle[] myCircles = new Circle[10];
        myCircles[0] = new Circle(12);

        for (int i = 0; i < myCircles.length; i++) {
            myCircles[i] = new Circle(i);
        }

        for (Circle c: myCircles) {
            c = new Circle(10); // c is a copy of the reference from the array doesn't change the actual value of array
        }

    }

}

