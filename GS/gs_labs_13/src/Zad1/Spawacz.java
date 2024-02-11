package Zad1;

public class Spawacz extends Osoba {
    private int stazpracy;

    Spawacz(String imie, int stazpracy) {
        super(imie);
        this.stazpracy = stazpracy;
    }

    public String wyswietl() {
        return super.wyswietl() + " " + stazpracy;
    }
}
