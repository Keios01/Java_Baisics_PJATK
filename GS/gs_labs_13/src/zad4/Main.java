package zad4;

public class Main {
    public static void main(String[] args) {
        RachunekBankowy rachunek1 = new RachunekBankowy(new Osoba(), 100d);
        RachunekBankowy rachunek2 = new RachunekBankowy(new Osoba(), 100d);

        try {
            rachunek1.wplata(100d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            rachunek1.wyplata(150d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            rachunek1.przelew(rachunek2, 50d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            rachunek2.wyplata(151d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        KontoVIP vip = new KontoVIP(new Osoba(), 100d, 10d, -50d);

        try {
            vip.wyplata(100d);
            //System.out.println("Ok");
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            vip.przelew(rachunek1, 50d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            vip.przelew(rachunek2, 1d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        try {
            vip.wyplata(1d);
        } catch (BlednaOperacja e) {
            System.out.println("Bledna operacja");
        }

        // -------------------- zad 7 ------------------------

        rachunek1.aktualizacja();
        vip.aktualizacja();

        // -------------------- zad 8 ------------------------
        RachunekBankowy[] lista = {
                new RachunekBankowy(new Osoba(), 50d),
                new Konto(new Osoba(), 60d, 5d),
                new KontoVIP(new Osoba(), 70d, 4d, -10d)
        };

        for(RachunekBankowy r : lista)
            r.aktualizacja();
    }
}
