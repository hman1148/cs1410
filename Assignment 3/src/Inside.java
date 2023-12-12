/**
 * Assignment 3 for CS 1410
 * This program determines if points are contained within circles or rectangles.
 */
public class Inside {
    /**
     * This is the primary driver code to test the "inside" capabilities of the
     * various functions.
     */
    public static void main(String[] args) {
        double[] ptX = {1, 2, 3, 4};
        double[] ptY = {1, 2, 3, 4};
        double[] circleX = {0, 5};
        double[] circleY = {0, 5};
        double[] circleRadius = {3, 3};
        double[] rectLeft = {-2.5, -2.5};
        double[] rectTop = {2.5, 5.0};
        double[] rectWidth = {6.0, 5.0};
        double[] rectHeight = {5.0, 2.5};


        System.out.println("--- Report of Points and Circles --- \n");
        for (int j = 0; j < circleX.length; j++) {
            for (int i = 0; i < ptX.length; i++) {
                    if (isPointInsideCircle(ptX[i], ptY[i], circleX[j], circleY[j], circleRadius[j])) {
                        reportPoint(ptX[i], ptY[i]);
                        System.out.print(" is inside ");
                        reportCircle(circleX[j], circleY[j], circleRadius[j]);
                        System.out.println();
                    } else {
                        reportPoint(ptX[i], ptY[i]);
                        System.out.print(" is outside ");
                        reportCircle(circleX[j], circleY[j], circleRadius[j]);
                        System.out.println();
                    }
            }
        }

        System.out.println();
        System.out.println("--- Report of Points and Circles ---\n");
        for (int j = 0; j < rectHeight.length; j++) {
            for (int i = 0; i < ptX.length; i++) {
                if (isPointInsideRectangle(ptX[i], ptY[i], rectLeft[j], rectTop[j], rectWidth[j], rectHeight[j])) {
                    reportPoint(ptX[i], ptY[i]);
                    System.out.print(" is inside ");
                    reportRectangle(rectLeft[j], rectTop[j], rectWidth[j], rectHeight[j]);
                    System.out.println();

                } else {
                    reportPoint(ptX[i], ptY[i]);
                    System.out.print(" is outside ");
                    reportRectangle(rectLeft[j], rectTop[j], rectWidth[j], rectHeight[j]);
                    System.out.println();
                }
            }
        }
    }

    public static void reportPoint(double x, double y) {
        System.out.printf("Point(%.1f, %.1f)", x, y);
    }

    public static void reportCircle(double x, double y, double r) {
        System.out.printf("Circle( %.1f, %.1f) Radius: %.1f", x, y, r);
    }

    public static void reportRectangle(double left, double top, double width, double height) {
        double right = left + width;
        double bottom = top - height;
        System.out.printf("Rectangle(%.1f, %.1f, %.1f, %.1f)", left, top, right, bottom);
    }

    public static boolean isPointInsideCircle(double ptX, double ptY, double circleX, double circleY, double circleRadius) {

        double distance = Math.sqrt(((ptX - circleX) * (ptX - circleX)) + ((ptY - circleY) * (ptY - circleY)));
        return !(distance > circleRadius);

    }

    public static boolean isPointInsideRectangle(double ptX, double ptY, double rLeft, double rTop, double rWidth, double rHeight) {
        // find distance formula for rectangles
        double right = rLeft + rWidth;
        double bottom = rTop - rHeight;

        return (ptX >= rLeft && ptX <= right) && (ptY <= rTop && ptY >= bottom);
    }
}
