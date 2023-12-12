import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        report(new Object());
        report(new Person());
        report(new Student());

    }

    public static void report(Object obj) {
        System.out.printf("The object toSTring result is: %s\n", obj);
    }

}
    class Person {
        @Override
        public String toString() {
            return "Person{}";
        }
    }

    class Student extends Person {
        @Override
        public String toString() {
            return "Student{}";
        }
    }
