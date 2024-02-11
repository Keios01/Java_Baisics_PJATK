package Zad2;

public class DrzewoOwocowe extends DrzewoLisciaste {
    private String nazwaOwoca;

    DrzewoOwocowe(
            boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
            int ksztaltLiscia,
            String nazwaOwoca
    ) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + " " + nazwaOwoca;
    }
}
