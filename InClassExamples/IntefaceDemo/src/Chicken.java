public class Chicken extends Animal {


    public Chicken(double weight) {
        super(weight);
    }

    @Override
    public String sound() {
        return "Hi";
    }

    @Override
    public String howToPrepare() {
        return "Cut";
    }
}
