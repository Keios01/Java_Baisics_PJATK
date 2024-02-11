package Zad2;
// + zadanie 3

public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo(false, 15, "przekroj");
        System.out.println(drzewo);

        Drzewo drzewoIglaste = new DrzewoIglaste(true, 10, "przek", 5, 12d);
        System.out.println(drzewoIglaste);

        Drzewo drzewoLisciaste = new DrzewoLisciaste(false, 12, "coto?", 3);
        System.out.println(drzewoLisciaste);

        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false, 5, "ow", 4, "Cytryna");
        System.out.println(drzewoOwocowe);
    }
}
