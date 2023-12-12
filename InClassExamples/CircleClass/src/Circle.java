

public class Circle {
    private double diameter;
    private static int numberCreated = 0;


    // Default constructor
    public Circle() {
        diameter = 1;
        numberCreated ++;
    }

    // Overloaded constructor
    public Circle(double radius) {
        numberCreated ++;
        if (radius > 1) {
            this.diameter = radius;
        } else {
            this.diameter = 1;
        }
    }

    public double getRadius() {
        return diameter / 2;
    }

    public double setRadius(double diameter) {
        if (diameter > 0) {
            return diameter * 2;
        } else {
            return 1;
        }
    }
    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return Math.PI * diameter * diameter;
    }

    public double getPerimeter() {
        return 2 * Math.PI * diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public static int getNumberCreated() {
         return numberCreated;
    }


 }
