public class Rectangle extends GemoetricObject {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Rectangle r = (Rectangle) obj;
            return this.getArea() == r.getArea();
        }
        return false;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
