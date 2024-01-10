// Method is in Print.java

public class Zad3
{
    public static void main(String[] args)
    {
        int[][] tab = 
        {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9, 0 }
        };

        int[] tab1D = { 1, 2, 3, 4 };

        int myInteger = 6;

        Print.show2D(tab);
        Print.show1D(tab1D);
        Print.show(myInteger);
    }
}