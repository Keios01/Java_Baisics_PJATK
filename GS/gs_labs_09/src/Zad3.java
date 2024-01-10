public class Zad3
{
    public static void main(String[] args)
    {
        int n = 20;

        int tablica[] = new int[n];

        // Fill table
        for( int i = 0; i < n; i++ )
        {
            tablica[i] = (int)(Math.random() * 21);
        }

        // Print table
        for(int i : tablica) System.out.println(i);
        System.out.println("------------");

        // Sort table
        for( int i = 0; i < n; i++ )
        {
            for( int j = i; j < n; j++ )
            {
                if (tablica[j] < tablica[i])
                {
                    int temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }

        // Print table
        for( int i : tablica ) System.out.println(i);
        System.out.println("----------");

        // Check repeating elements
        int repeats = 0;

        for( int i = 0; i < n - 1; i++ )
        {
            if( tablica[i] == tablica[i+1] )
            {
                repeats++;
                while(tablica[i] == tablica[i+1] && i + 1 != n - 1 )
                    i++;
            }
        }

        System.out.println("Powtórzenia: " + repeats);
    }
}
