public class PrintTable
{
    public static void prTab(int tab[][])
    {
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j]);

            System.out.println();
        }

        System.out.println("-----------");
    }
}