package Zad2;

public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa;
    }
}
