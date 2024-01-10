public class Zad6
{
    public static void main(String[] args) {
        int n = 5;
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[A.length + B.length];

        fill(A);
        fill(B);

        System.out.println("--- nieposortowana A ---");
        for(int i : A) System.out.print(i + " ");
        System.out.println("\n--- nieposortowana B ---");
        for(int i : B) System.out.print(i + " ");

        sort(A, true);
        sort(B, false);

        System.out.println("\n--- posortowana A ---");
        for(int i : A) System.out.print(i + " ");
        System.out.println("\n--- posortowana B ---");
        for(int i : B) System.out.print(i + " ");

        merge(A, B, C);
        System.out.println("\n--- posortowana C ---");
        for(int i : C) System.out.print(i + " ");
    }

    public static void fill(int[] tablica)
    {
        for( int i = 0; i < tablica.length; i++ )
        {
            tablica[i] = (int)(Math.random() * 21);
        }
    }

    public static void sort(int[] tablica, boolean asc)
    {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i; j < tablica.length; j++) {
                if (tablica[j] < tablica[i] && asc == true) {
                    int temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }

                else if(tablica[j] > tablica[i] && asc == false)
                {
                    int temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
    }

    public static void merge(int[] tablica1, int[] tablica2, int[] wynik)
    {
        if(tablica1[0] > tablica1[tablica1.length - 1])
            sort(tablica1, true);
        if(tablica2[0] > tablica2[tablica2.length - 1])
            sort(tablica2, true);

        int i, i1 = 0, i2 = 0;
        for(i = 0; (i1 < tablica1.length && i2 < tablica2.length); i++)
        {
            if (tablica1[i1] < tablica2[i2])
            {
                wynik[i] = tablica1[i1];
                i1++;
            }

            else if (tablica1[i1] >= tablica2[i2])
            {
                wynik[i] = tablica2[i2];
                i2++;
            }
        }

        if(i1 == tablica1.length)
            for(; i2 < tablica2.length; i++)
            {
                wynik[i] = tablica2[i2];
                i2++;
            }
        else
            for(; i1 < tablica1.length; i++)
            {
                wynik[i] = tablica1[i1];
                i1++;
            }
    }
}