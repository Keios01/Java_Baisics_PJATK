public class Zad1
{
    public static void main(String[] args)
    {
        System.out.println("Hello");

        int[][] tab =
        {
            {1, 0, 0, 0 },
            {0, 1, 0, 0},
            {0, 0, 1}
        };

        int tabSize = 0;
        for(int i = 0; i < tab.length; i++)
        {
            tabSize += tab[i].length;
        }

        int[] newTab = new int[tabSize];
        int n = 0;

        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
                newTab[n] = tab[i][j];
                ++n;
            }
        }

        for(int e : newTab) System.out.print(e + " ");
    }
}