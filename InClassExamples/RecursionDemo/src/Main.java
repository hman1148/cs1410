import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Factorial of 5: %d\n", factorial(10));
        System.out.printf("Factorial of 11: %d\n", factorial(3));
        System.out.printf("Fib of 5  %d\n", fib(5));
        System.out.printf("Fib of 11 %d\n", fib(11));

//        int[] primes = {2, 3, 5, 7, 11, 13, 17, 23, 29, 31, 37};
//        boolean result = binarySearch(5, primes)z;
//
//        if (result) {
//            System.out.println("Found the value");
//        } else {
//            System.out.println("Did not find the vlaue");
//        }
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static boolean binarySearch(int search, int[] data) {
        return binarySearch(search, data, 0, data.length - 1);
    }

    public static boolean binarySearch(int search, int[] data, int lower, int upper) {
        if (lower > upper) {
            return false;
        }

        int middle = (lower + upper) / 2;

        if (data[middle] == search) {
            return true;
        } else if (data[middle] < search) {
            return binarySearch(search, data, lower + 1, upper);
        } else {
            return binarySearch(search, data, lower, upper - 1);
        }
    }

    public static long factorialTail(int n, int result) {
        return 0;
    }

}