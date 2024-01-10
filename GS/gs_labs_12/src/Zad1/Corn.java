package Zad1;

public class Corn
{
    private int cornCount;

    Corn(int cornCount) { this.cornCount = cornCount; }

    public Popcorn[] makePopcorn()
    {
        return new Popcorn[(int)(Math.random() * (cornCount + 1))];
    }
}
