package Zad5;

public class Prostopadloscian extends Prostokat {
    private double wysokosc;

    Prostopadloscian(int a, int b, int c)
    {
        super(a, b);
        this.wysokosc = c;
    }

    Prostopadloscian(int c)
    {
        this.wysokosc = c;
    }

    public double poleP()
    {
        return (2*this.wysokosc*this.getDlugosc()) +
               (2*this.wysokosc*this.getSzerokosc()) +
               (2*this.pole());
    }
    public double objetoscP()
    {
        return this.wysokosc * this.pole();
    }
}
