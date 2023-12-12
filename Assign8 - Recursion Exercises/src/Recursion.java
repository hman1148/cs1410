public class Recursion {
    public static void main(String[] args) {

        int[] sumMe = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        System.out.printf("Array Sum: %d\n", arraySum(sumMe, 0));

        int[] minMe = { 0, 1, 1, 2, 3, 5, 8, -42, 13, 21, 34, 55, 89 };
        System.out.printf("Array Min: %d\n", arrayMin(minMe, 0));

        String[] amISymmetric =  {
                "You can cage a swallow can't you but you can't swallow a cage can you",
                "I still say cS 1410 is my favorite class"
        };
        for (String test : amISymmetric) {
            String[] words = test.toLowerCase().split(" ");
            System.out.println();
            System.out.println(test);
            System.out.printf("Is word symmetric: %b\n", isWordSymmetric(words, 0, words.length - 1));
        }

        double weights[][] = {
                { 51.18 },
                { 55.90, 131.25 },
                { 69.05, 133.66, 132.82 },
                { 53.43, 139.61, 134.06, 121.63 }
        };
        System.out.println();
        System.out.println("--- Weight Pyramid ---");
        for (int row = 0; row < weights.length; row++) {
            for (int column = 0; column < weights[row].length; column++) {
                double weight = computePyramidWeights(weights, row, column);
                System.out.printf("%.2f ", weight);
            }
            System.out.println();
        }

        char image[][] = {
                {'*','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ','*','*',' ',' '},
                {' ','*',' ',' ','*','*','*',' ',' ',' '},
                {' ','*','*',' ','*',' ','*',' ','*',' '},
                {' ','*','*',' ','*','*','*','*','*','*'},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ','*','*','*',' ',' ','*',' '},
                {' ',' ',' ',' ',' ','*',' ',' ','*',' '}
        };
        int howMany = howManyOrganisms(image);
        System.out.println();
        System.out.println("--- Labeled Organism Image ---");
        for (char[] line : image) {
            for (char item : line) {
                System.out.print(item);
            }
            System.out.println();
        }
        System.out.printf("There are %d organisms in the image.\n", howMany);

    }

    public static long arraySum(int[] data, int position) {

        long count = 0;
        if (position >= data.length) {
            return 0;
        }
        count += arraySum(data, position + 1) + data[position];
        return count;
    }

    public static int arrayMin(int[] data, int position) {

        if (position == data.length - 1) {
            return data[position];
        }
        int min = data[position];

        if (min < arrayMin(data, position  + 1)) {
            return min;
        }
        return arrayMin(data, position + 1);
    }

    public static boolean isWordSymmetric(String[] words, int start, int end) {

        if (start >= end) {
             return true;
        }
        String startWord = words[start];
        String endWord = words[end];

        if (startWord.equalsIgnoreCase(endWord)) {
            return isWordSymmetric(words, start + 1, end - 1);
        } else {
            return false;
        }
    }
    public static double computePyramidWeights(double[][] weights, int row, int column) {
        if(row < 0 || row > weights.length - 1){
            return 0;
        }
        if (column < 0 || column > weights[row].length - 1) {
            return 0;
        }
        if (row == 0) {
            return weights[row][column];
        } else {
            double currentVal = weights[row][column];
            return .5 * computePyramidWeights(weights, row - 1, column - 1) + (.5 * computePyramidWeights(weights, row - 1, column) + currentVal);
        }
    }
    public static int howManyOrganisms(char[][] image) {

        int counter = 0;
        char character = 'a';

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {

                if (image[i][j] == '*') {
                    counter ++;
                    labelOrganism(image, character, i, j);
                    character ++;
                }
            }
        }
        return counter;
    }
    public static void labelOrganism(char[][] image, char character, int row, int col) {
        if (col < 0 || row < 0) {
            return;
        }
        if (row >= image.length) {
            return;
        }
        if (col >= image[row].length) {
            return;
        }
        if (image[row][col] == '*') {
            image[row][col] = character;
            labelOrganism(image, character, row + 1, col);
            labelOrganism(image,character, row, col + 1);
            labelOrganism(image,character, row, col - 1);
            labelOrganism(image,character, row - 1, col);
        }
    }
}
