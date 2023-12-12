public class Apple extends Fruit{

    public Apple() {
        super("Red");
    }

    @Override
    public String howToPrepare() {
        return "Slice";
    }
}
