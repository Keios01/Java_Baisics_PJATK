public class Zad6
{
    public static void main(String[] args)
    {
        int[] tab1 = new int[(int)(Math.random() * 10)];
        fillTable(tab1);
        Print.show1D(tab1);

        int[] tab2 = new int[(int)(Math.random() * 10)];
        fillTable(tab2);
        Print.show1D(tab2);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int settings = scanner.nextInt();

        Print.show1D(myMethod(tab1, tab2, settings));
    }

    public static int[] myMethod(int[] tab1, int[] tab2, int settings)
    {
        int[] result = new int[0];

        if(tab1.length == tab2.length)
        {
            ;
        }

        else if(settings < 0)
        {
            // Zmienna "size" równa rozmiarowi mniejszej tablicy z argumentów
            int size;

            if(tab1.length < tab2.length)
                size = tab1.length;
            else
                size = tab2.length;

            result = new int[size];

            for(int i = 0; i < size; i++)
                result[i] = tab1[i] + tab2[i];
        }

        else if(settings > 0)
        {
            int smallerSize, biggerSize;
            int[] biggerTable;

            if(tab1.length < tab2.length)
            {
                smallerSize = tab1.length;
                biggerSize = tab2.length;
                biggerTable = tab2;
            }
            else
            {
                smallerSize = tab2.length;
                biggerSize = tab1.length;
                biggerTable = tab1;
            }

            result = new int[biggerSize - smallerSize];

            for(int i = 0, j = smallerSize; j < biggerSize; i++, j++)
                result[i] = biggerTable[j];
        }

        return result;
    }

    public static void fillTable(int[] tab)
    {
        for(int i = 0; i < tab.length; i++)
            tab[i] = (int)(Math.random() * 10);
    }
}