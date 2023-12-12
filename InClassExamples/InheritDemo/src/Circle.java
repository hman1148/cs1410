public class Circle extends GemoetricObject {

    private final double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public String getType() {
        return "Circle";
    }


    // How we can compare different elements with other objects
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;
            }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "radius";
        // super.toString inhertis the properties of the overridden method in the
        // Geometric class
//    }
//    public class InvalidRadiusException extends RuntimeException {
//        public InvalidRadiusException(double radius) {
//            this.radius = radius;
//        }
}
}