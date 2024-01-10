package Zad4;

public class Phrase {
    private String[] arr;
    private int dlugosc;

    Phrase()
    {
        this.arr = new String[100];
        this.dlugosc = 0;
    }

    public void addWordAtEnd(String Word)
    {
        this.arr[this.dlugosc] = Word;
        this.dlugosc++;
    }

    public void show()
    {
        for(int i = 0; i < this.dlugosc; i++)
            System.out.print(this.arr[i] + " ");
    }
}
