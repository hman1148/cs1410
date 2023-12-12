public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger(100);
        Animal chicken = new Chicken(4);


        Fruit apple = new Apple();
        Fruit orange = new Orange();

        prepareToEat();

    }


    public static void prepareToEat(Edible e) {
        System.out.print("Preparing something to eat....");
        System.out.println(e.howToPrepare());
    }

}