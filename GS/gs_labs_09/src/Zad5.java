public class Zad5 {
    public static void main(String[] args) {
        int nOfPoints = 15;

        int[] pointX = new int[nOfPoints];
        Zad5.fill(pointX);
        Zad5.printArray(pointX, "Array of X points");

        int[] pointY = new int[nOfPoints];
        Zad5.fill(pointY);
        Zad5.printArray(pointY, "Array of Y points");

        System.out.println();

        int topLeftXIndex = findIndex(pointX, true);
        int topLeftYIndex = findIndex(pointY, false);
        System.out.println("Top left X: " + pointX[topLeftXIndex]);
        System.out.println("Top left Y: " + pointY[topLeftYIndex]);

        int bottomRightXIndex = findIndex(pointX, false);
        int bottomRightYIndex = findIndex(pointY, true);
        System.out.println("Bottom right X: " + pointX[bottomRightXIndex]);
        System.out.println("Bottom right Y: " + pointY[bottomRightYIndex]);

        System.out.println();
        System.out.println(
                "Middle X: " +
                ((pointX[topLeftXIndex] + pointX[bottomRightXIndex] ) / 2.0)
        );
        System.out.println(
                "Middle Y: " +
                ((pointY[topLeftYIndex] + pointY[bottomRightYIndex]) / 2.0)
        );

        System.out.println();
        System.out.println(
                "Rectangle height: " +
                (Math.abs(pointY[topLeftYIndex]) + Math.abs(pointY[bottomRightYIndex]))
        );
        System.out.println(
                "Rectangle width: " +
                (Math.abs(pointX[topLeftXIndex]) + Math.abs(pointX[bottomRightXIndex]))
        );
    }

    public static void fill(int[] array)
    {
        for(int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 21) - 10;
    }

    public static void printArray(int[] array, String title)
    {
        System.out.println("\n--- " + title + " ---");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static int findIndex(int[] array, boolean smallest)
    {
        int result = 0;
        if(smallest)
        {
            for (int i = 1; i < array.length; i++)
            {
                if (array[i] < array[result])
                    result = i;
            }
        }
        else
        {
            for(int i = 1; i < array.length; i++)
            {
                if(array[i] > array[result])
                    result = i;
            }
        }

        return result;
    }
}
