public class Zad2
{
    public static void main(String[] args)
    {
        int tabY = (int)(Math.random() * 10);
        int tabX = (int)(Math.random() * 10) + 1;

        int[][] tab = new int[tabY][tabX];

        int rowLengths, newTabIndex;
        int[][] newTab = new int[tabY][0];

        // Fill array
        for(int i = 0; i < tabY; i++)
        {
            for(int j = 0; j < tabX; j++)
            {
                tab[i][j] = (int)(Math.random() * 10);
            }
        }

        Print.show2D(tab);
        
        for(int i = 0; i < tabY; i++)
        {
            rowLengths = 0;

            // Delete repeating elements
            // and count unique elements (in rowLengths)
            for(int j = 0; j < tabX; j++)
            {
                if(tab[i][j] != -1) // Reduces number of iterations
                {
                    for(int n = j + 1; n < tabX; n++)
                    {
                        if(tab[i][j] == tab[i][n])
                            tab[i][n] = -1;  
                    }

                    rowLengths++;
                }
            }

            // Set row length in target array
            newTab[i] = new int[rowLengths];

            // Fill new array row with unique elements
            newTabIndex = 0;
            for(int j = 0; j < tabX; j++)
            {
                if(tab[i][j] != -1)
                {
                    newTab[i][newTabIndex] = tab[i][j];
                    newTabIndex++;
                }
            }
        }

        Print.show2D(tab);
        Print.show2D(newTab);
    }
}