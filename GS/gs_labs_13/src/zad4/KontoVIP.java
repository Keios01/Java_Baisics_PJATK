package zad4;

public class KontoVIP extends Konto {
    private double limitDebetu;
    private int probyPrzekroczeniaLimitu;

    KontoVIP(
            Osoba wlasciciel, double stan,
            double oprocentowanie,
            double limitDebetu
    ) {
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu = limitDebetu;
    }

    @Override
    public void wyplata(double kwota) throws BlednaOperacja {
        if(kwota <= getStan() - limitDebetu)
            setStan(getStan() - kwota);
        else {
            probyPrzekroczeniaLimitu++;
            throw new BlednaOperacja();
        }
    }

    @Override
    public void przelew(RachunekBankowy rach, double kwota) throws BlednaOperacja {
        wyplata(kwota);
        rach.wplata(kwota);
    }

    @Override
    public void aktualizacja() {
        super.aktualizacja();
        System.out.println(probyPrzekroczeniaLimitu);
    }
}
