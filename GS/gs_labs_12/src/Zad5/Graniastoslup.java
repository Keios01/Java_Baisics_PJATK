package Zad5;

public class Graniastoslup extends Trojkat
{
    private double wysokosc;
    Graniastoslup(double a, double h)
    {
        super(a);
        this.wysokosc = h;
    }

    public double poleBryly()
    {
        return 2 * pole()
                + 3 * getBok() * wysokosc;
    }

    public double objetosc()
    {
        return pole() * wysokosc;
    }
}
