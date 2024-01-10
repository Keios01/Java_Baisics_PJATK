package Zad5;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    Prostokat(int a, int b)
    {
        this.dlugosc = a;
        this.szerokosc = b;
    }

    Prostokat()
    {
        this(5, 6);
    }

    public double pole()
    {
        return this.dlugosc * this.szerokosc;
    }

    public double getDlugosc()
    {
        return this.dlugosc;
    }

    public double getSzerokosc()
    {
        return this.szerokosc;
    }
}
