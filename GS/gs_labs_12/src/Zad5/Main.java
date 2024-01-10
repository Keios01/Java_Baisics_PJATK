package Zad5;

public class Main {
    public static void main(String[] args)
    {
        String outputDivider = "-----------------";

        Prostokat prostokat = new Prostokat(3, 4);
        System.out.println(prostokat.pole());
        System.out.println(outputDivider);

        Prostokat prostokatDomyslny = new Prostokat();
        System.out.println(prostokatDomyslny.pole());
        System.out.println(outputDivider);

        Prostopadloscian prostopadloscian = new Prostopadloscian(2, 4, 5);
        System.out.println("Pole powierzchni calkowitej: " + prostopadloscian.poleP());
        System.out.println("Objetosc: " + prostopadloscian.objetoscP());
        System.out.println("Pole podstawy: " + prostopadloscian.pole());
        System.out.println(outputDivider);

        Prostopadloscian prostopadloscianDomyslny = new Prostopadloscian(5);
        System.out.println("Pole powierzchni calkowitej: " + prostopadloscianDomyslny.poleP());
        System.out.println("Objetosc: " + prostopadloscianDomyslny.objetoscP());
        System.out.println("Pole podstawy: " + prostopadloscianDomyslny.pole());
        System.out.println(outputDivider);

        Trojkat trojkat = new Trojkat(3);
        System.out.println(trojkat.pole());
        System.out.println(outputDivider);

        Ostroslup ostroslup = new Ostroslup(4, 5);
        System.out.println("Pole powierzchni calkowitej: " + ostroslup.poleBryly());
        System.out.println("Objetosc: " + ostroslup.objetosc());
        System.out.println("Pole podstawy: " + ostroslup.pole());
        System.out.println(outputDivider);

        Graniastoslup graniastoslup = new Graniastoslup(7, 9);
        System.out.println("Pole powierzchni calkowitej: " + graniastoslup.poleBryly());
        System.out.println("Objetosc: " + graniastoslup.objetosc());
        System.out.println("Pole podstawy: " + graniastoslup.pole());
        System.out.println(outputDivider);
    }
}
