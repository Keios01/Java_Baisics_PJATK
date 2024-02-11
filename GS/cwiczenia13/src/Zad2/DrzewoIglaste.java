package Zad2;

public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszki;

    DrzewoIglaste(
            boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
            int iloscIgiel, double dlugoscSzyszki
    ) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + " " + iloscIgiel + " " + dlugoscSzyszki;
    }
}
