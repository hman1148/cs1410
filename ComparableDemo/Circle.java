public class Circle implements Comparable<Circle>{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {
            return 1;
        }
        if (this.radius == o.radius) {
            return 0;
        }
        return -1;
    }
}
