// Zad 3

public class Print
{
    public static void show(int i)
    {
        System.out.println(i + "\n-----------");
    }

    public static void show1D(int tab[])
    {
        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println("\n-----------");
    }

    public static void show2D(int tab[][])
    {
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j] + " ");

            System.out.println();
        }

        System.out.println("-----------");
    }
}