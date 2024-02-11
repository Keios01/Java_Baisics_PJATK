package zad4;

public class Konto extends RachunekBankowy {
    private double oprocentowanie;
    private double odsetki;

    Konto(
            Osoba wlasciciel, double stan,
            double oprocentowanie
    ) {
        super(wlasciciel, stan);
        this.oprocentowanie = oprocentowanie;
    }

    @Override
    public void aktualizacja() {
        super.aktualizacja();
        odsetki += oprocentowanie;
        System.out.println(odsetki);
    }
}
