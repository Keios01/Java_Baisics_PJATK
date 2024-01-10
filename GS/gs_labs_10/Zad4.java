public class Zad4
{
    public static void main(String[] args)
    {
        int wrt = 5;
        System.out.println("wrt przed wykonaniem metody:");
        Print.show(wrt);

        modifyValue(wrt);

        System.out.println("wrt po wykonaniu metody:");
        Print.show(wrt);

        // Wynikiem drugiego wypisania wrt jest 5
        // Jest tak, ponieważ metoda modifyValue operuje na kopii zmiennej wrt
    }

    public static void modifyValue(int liczba)
    {
        System.out.println("*** modifyValue Start ***\n" + liczba);
        liczba = liczba * 5;
        System.out.println(liczba + "\n**** modifyValue End ****");
    }
}