package Zad5;

public class Trojkat
{
    private double bok;

    Trojkat(double a) { this.bok = a; }

    Trojkat() { this(5); }

    public double pole()
    {
        return Math.pow(bok, 2) * Math.sqrt(3) / 4;
    }

    // GETTERS
    public double getBok() { return bok; }
}
