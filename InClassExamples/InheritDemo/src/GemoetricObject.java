import java.util.ArrayList;

public abstract class GemoetricObject {
    private String color;
    private boolean filled;

    public GemoetricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public static <T extends GemoetricObject> double getArea(ArrayList<T> objects) {

    }

    public abstract double getArea();
    public abstract String getType();

    public String toString() {
        return "GemoetricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
