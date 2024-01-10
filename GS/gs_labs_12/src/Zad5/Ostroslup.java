package Zad5;

public class Ostroslup extends Trojkat
{
    private double wysokosc;

    Ostroslup(double a, double h)
    {
        super(a);
        this.wysokosc = h;
    }

    public double poleBryly()
    {
        return pole()
                + (1d / 2d * 3 * getBok()
                * Math.sqrt(
                        Math.pow(wysokosc, 2)
                        + Math.pow(getBok()/(2*Math.tan(Math.toRadians(60d))),2)
                ));
    }

    public double objetosc()
    {
        return 1d / 3d * pole() * wysokosc;
    }
}
