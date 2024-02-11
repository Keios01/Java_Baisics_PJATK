package zad4;
// + zadania 5,6,7,8

public class RachunekBankowy {
    private Osoba wlasciciel;
    private double stan;

    RachunekBankowy(Osoba wlasciciel, double stan) {
        this.wlasciciel = wlasciciel;
        this.stan = stan;
    }

    public void wplata(double kwota) throws BlednaOperacja {
        if(kwota > 0)
            stan = stan + kwota;
        else
            throw new BlednaOperacja();
    }

    public void wyplata(double kwota) throws BlednaOperacja {
        if(kwota <= stan)
            stan = stan - kwota;
        else
            throw new BlednaOperacja();
    }

    public void przelew(RachunekBankowy rach, double kwota) throws BlednaOperacja {
        wyplata(kwota);
        rach.wplata(kwota);
    }

    public double getStan() { return stan; }
    public void setStan(double value) { stan = value; }

    public void aktualizacja() {
        System.out.println(wlasciciel + " " + this.getClass() + " " + stan);
    }
}
