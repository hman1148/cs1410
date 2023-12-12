public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        Employee e = new Employee();



    }
}

class Person {
    public Person() {
        System.out.println("(1) Performs Person things");
    }

    public static String yourMom() {
        return "Im your mom";
    }
}

class Employee extends Person {
    private String yourMom;
    public Employee() {
        this.yourMom = yourMom();
        System.out.println("(2) Performs Employee things");
    }

    public Employee(String msg) {
        System.out.println("(3) Performs Emplyee things with message " + msg);
    }

}