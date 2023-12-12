
public class Main {
    public static void main(String[] args) {
        int[] sort= {10 , 2, 20 , 4, 40, 6, 60, 8, 80, 12, 120, 22};
        quickSort(sort);
        for (int value : sort) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1);
            quickSort(data, pivot - 1, end);
        }
    }

    public static int partition(int[] data, int start, int end){
        int middle = start + (end - start) / 2;
        int pivotValue = data[middle];

        int temp = data[start];
        data[start] = data[middle];
        data[middle] = temp;

        int pivotIndex = start;

        for (int scan = start + 1; scan <= end; scan++) {
            if (data[scan] < pivotValue) {
                pivotIndex++;
                temp = data[pivotIndex];
                data[pivotIndex] = data[scan];
                data[scan] = temp;
            }
        }
        temp = data[start];
        data[start] = data[pivotIndex];
        data[pivotIndex] = temp;

        return pivotIndex;
    }

}