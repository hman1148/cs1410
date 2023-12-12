public class Orange extends Fruit {

    public Orange() {
        super("Orange");
    }

    @Override
    public String howToPrepare() {
        return "Peel";
    }

    public void report() {
        System.out.println("Here is the color: " + getColor());
    }
 }
