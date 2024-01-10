public class CustomRowLength
{
    public static void main(String[] args)
    {
        int tabSize = 3;

        int[][] tab = new int[tabSize][0];

        // RANDOM ROW LENGTH
        for(int i = 0; i < tab.length; i++)
            tab[i] = new int[(int)(Math.random() * 10) + 1];

        Print.show2D(tab);


        // CUSTOMIZABLE ROW LENGTHS
        int[] rowLength = {4, 2, 8};    // rowLength.length = tabSize = 3;

        for(int i = 0; i < tab.length; i++)
            tab[i] = new int[rowLength[i]];

        Print.show2D(tab);
    }
}