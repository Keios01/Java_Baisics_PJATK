public class Main
{
    public static void main(String[] args)
    {
        // ZADANIE II
/*         {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int liczba = 1;

            while(liczba != 0)
            {
                System.out.println("Podaj liczbę:");
                liczba = scanner.nextInt();
            }
        } */

        // ZADANIE III
/*         {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int indeks, suma = 0;

            System.out.println("Podaj numer studenta:");
            indeks = scanner.nextInt();

            for(int i = 0; i <= indeks; i++)
                suma += i;

            System.out.println("Suma: " + suma);
        } */

        // ZADANIE IV
/*         {
            int dzien = 29, miesiac = 10, minelo = 0;

            for(int i = 1; i < miesiac; i++)
            {
                int dni = switch(i)
                {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> 28;
                    default -> 0;
                };

                minelo += dni;
            }

            minelo += dzien;
            System.out.println(minelo);
        } */

        // ZADANIE V
        /* {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int start, end;

            // Sprawdza czy a należy do [0, 100)
            do
            {
                System.out.println("Podaj 1 liczbę:");
                start = scanner.nextInt();
            } 
            while (start < 0 || start >= 100);

            // Sprawdza czy b należy do [0, 100) i czy jest mniejsze od a
            do
            {
                System.out.println("Podaj 2 liczbę:");
                end = scanner.nextInt();
            }
            while (end < 0 || end >= 100 || end <= start);

            // Losuje losową liczbę i sprawdza czy należy do [a, b]
            int rand = (int)(Math.random()*100), tries = 0;

            do 
            {
                tries++;
                System.out.println("Wylosowana liczba to " + rand +
                                    ", znajduje sie ona poza przedziałem [" +
                                    start + ", " + end + "].");
                rand = (int)(Math.random()*100);
            } 
            while (rand < start || rand > end);

            // Drukuje wynik
            System.out.println("Liczba " + rand + "\nIlosc prob: " + tries);
        } */

        // Zadanie VI
        {
            long number = 900;
            boolean continueLoop = true;

            for(long i = number / 2; (i > 0 && continueLoop); i--)
            {
                if(number % i == 0)
                {
                    System.out.println("Dzielnik: " + i);

                    for(long j = i - 1; j > 1 && i % j != 0; j--)
                    {
                        if(j == 2)
                        {
                            continueLoop = false;
                            System.out.println("Największy wspólny dzielnik: " + i);
                        }
                    }
                }
            }
        }
    }
}