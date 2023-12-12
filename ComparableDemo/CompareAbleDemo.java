public class CompareAbleDemo {
    public static void main(String[] args) {

        Circle[] circles = new Circle[100];

        for (int i = 0; i < circles.length; i ++) {
            circles[i] = new Circle(Math.random() * 100);
        }

        quickSort(circles);

    }
    public static <E extends Comparable<E>> void quickSort(E[] data) {
        quickSort(data, 0, data.length - 1);
    }

    public static <E extends Comparable<E>> void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);
            quickSort(data, start, end - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    public static <E extends Comparable<E>> void partition(int[] data, int start, int end) {
        int middle = start + (end - start) / 2;
        E pivotValue = data[middle];

        int temp = data[start];
        data[start] = data[middle];
        data[middle] = temp;

        int pivotIndex = start;
    }
}
