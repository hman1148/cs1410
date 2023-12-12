import java.util.Arrays;

/**
 * Assignment 4 for CS 1410
 * This program evaluates the linear and binary searching, along
 * with comparing performance difference between the selection sort
 * and the built-in java.util.Arrays.sort.
 *
 * @author James Dean Mathias
 */

public class EvaluationDriver {
    static final int MAX_VALUE = 1_000_000;
    static final int MAX_ARRAY_SIZE = 100_000;
    static final int ARRAY_INCREMENT = 20_000;
    static final int NUMBER_SEARCHES = 50_000;

    public static void main(String[] args) {
        demoLinearSearchUnsorted();
        demoLinearSearchSorted();
        demoBinarySearchSelectionSort();
        demoBinarySearchFastSort();
    }

    public static int[] generateNumbers(int howMany, int maxValue) {
            int[] data;
            if (howMany > 0) {
                data = new int[howMany]; //possible change
            } else {
                return null;
            }
            for (int i = 0; i < data.length; i++) {
                int randNums = (int) (Math.random() * maxValue);
                data[i] = randNums;
            }
            return data;
         }

    public static boolean linearSearch(int[] data, int search) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == search) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] data, int search) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == search) {
                return true;
            }
            if (search < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void selectionSort(int[] data) {

        for (int start = 0; start < (data.length) - 1; start++) {
            int minPos = start;
            int leftOver = data.length;
            for (int scan = start + 1; scan < leftOver; scan++) { // lecture notes are oof, the -- value shouldn't be given
                if (data[scan] < data[minPos]) {
                    minPos = scan;
                }
            }
            int temp = data[start];
            data[start] = data[minPos];
            data[minPos] = temp;
        }
    }

    // demoLinearSearchUnsorted
    public static void demoLinearSearchUnsorted() {

        int[] array = generateNumbers(MAX_ARRAY_SIZE, MAX_VALUE); // create random array
        int foundNums = 0;
        long start = System.currentTimeMillis();
        long totalTime;

        System.out.print("--- Linear Search Timing (unsorted) ---\n");

        for (int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i+= ARRAY_INCREMENT) {
            for (int j = 0; j < NUMBER_SEARCHES; j++) {
                int randNum = (int) (Math.random() * MAX_VALUE);

                if (linearSearch(array, randNum)) {
                   foundNums++;
                }
            }

            long end = System.currentTimeMillis();
            totalTime = end - start;

            System.out.printf("Number of items         : %d \n", i);
            System.out.printf("Times value was found   : %d \n", foundNums);
            System.out.printf("Time                    : %d ms \n", totalTime);
            System.out.println();

        }

    }

    // demoLinearSearchSorted
    public static void demoLinearSearchSorted() {

        int[] array = generateNumbers(MAX_ARRAY_SIZE, MAX_VALUE);
        int foundNums = 0;
        long start = System.currentTimeMillis();
        long totalTime;

        System.out.print("--- Linear Search Timing (Selection Sort) ---\n");

        for (int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i+=ARRAY_INCREMENT) {
            selectionSort(array);
            for (int j = 0; j < NUMBER_SEARCHES; j++) {
                int randNum = (int) (Math.random() * MAX_VALUE);

                if (linearSearch(array, randNum)) {
                    foundNums++;
                }
            }

            long end = System.currentTimeMillis();
            totalTime = end - start;

            System.out.printf("Number of items         : %d \n", i);
            System.out.printf("Times value was found   : %d \n", foundNums);
            System.out.printf("Time                    : %d ms \n", totalTime);
            System.out.println();

        }
    }
    // demoBinarySearchSelectionSort
    public static void demoBinarySearchSelectionSort() {

        int[] array = generateNumbers(MAX_ARRAY_SIZE, MAX_VALUE);
        int foundNums = 0;
        long start = System.currentTimeMillis();
        long totalTime;

        System.out.print("--- Binary Search Timing (Selection Sort) ---\n");

        for (int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i+=ARRAY_INCREMENT) {
            selectionSort(array);
            for (int j = 0; j < NUMBER_SEARCHES; j++) {

                int randNum = (int) (Math.random() * MAX_VALUE);
                if (binarySearch(array, randNum)) {
                    foundNums++;
                }
            }

            long end = System.currentTimeMillis();
            totalTime = end - start;

            System.out.printf("Number of items         : %d \n", i);
            System.out.printf("Times value was found   : %d \n", foundNums);
            System.out.printf("Time                    : %d ms \n", totalTime);
            System.out.println();

        }

    }
    // demoBinarySearchFastSort
    public static void demoBinarySearchFastSort() {

        int[] array = generateNumbers(MAX_ARRAY_SIZE, MAX_VALUE);
        int foundNums = 0;
        long start = System.currentTimeMillis();
        long totalTime;

        System.out.print("--- Binary Search Timing (Arrays.sort) ---\n");
        for (int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i+=ARRAY_INCREMENT) {
            Arrays.sort(array);
            for (int j = 0; j < NUMBER_SEARCHES; j++) {

                int randNum = (int) (Math.random() * MAX_VALUE);


                if (binarySearch(array, randNum)) {
                    foundNums ++;
                }
            }
            long end = System.currentTimeMillis();
            totalTime = end - start;

            System.out.printf("Number of items         : %d \n", i);
            System.out.printf("Times value was found   : %d \n", foundNums);
            System.out.printf("Time                    : %d ms \n", totalTime);
            System.out.println();
        }
    }
}
