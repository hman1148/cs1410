

public class Main {
    public static void main(String[] args) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int val = 97;
        long currentTime = System.currentTimeMillis();
        long endTime;

        if (binarySearch(primes, val)) {
            System.out.printf("The value of %d was found\n", val);
            endTime = System.currentTimeMillis();
        } else {
            System.out.printf("The value of %d was not found\n", val);
            endTime = System.currentTimeMillis();
        }
        long totalTime = endTime - currentTime;
        System.out.printf("The time taken was %d milliseconds", totalTime);
    }

    public static boolean binarySearch(int[] data, int search) {
        int lower = 0;
        int upper = data.length - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2; // we divide both so we don't get a bug with larger data sets

            if (data[mid] == search) {
                return true;
            }

            if (search < data[mid]) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return false;
    }
}
