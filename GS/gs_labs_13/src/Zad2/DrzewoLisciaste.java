package Zad2;

public class DrzewoLisciaste extends Drzewo {
    private int ksztaltLiscia;

    DrzewoLisciaste(
            boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
            int ksztaltLiscia
    ) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ksztaltLiscia;
    }
}
