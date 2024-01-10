package Zad3;

public class Word {
    char[] znaki;
    int dlugosc;

    Word()
    {
        this.znaki = new char[100];
        for(int i = 0; i < this.znaki.length; i++)
            this.znaki[i] = 0;
        this.dlugosc = 0;
    }

    public void addChar(char znak)
    {
        this.znaki[this.dlugosc] = znak;
        this.dlugosc++;
    }

    public void show()
    {
        for(int i = 0; i < this.dlugosc; i++)
            System.out.print(this.znaki[i]);
    }

    public int length()
    {
        return this.dlugosc;
    }

    public void showAll()
    {
        for(int i = 0; i < this.znaki.length; i++)
            System.out.print(this.znaki[i]);
    }
}
