package Zad1;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jarek");
        System.out.println(osoba.wyswietl());

        Osoba spawacz = new Spawacz("Andrzej", 12);
        System.out.println(spawacz.wyswietl());
    }
}