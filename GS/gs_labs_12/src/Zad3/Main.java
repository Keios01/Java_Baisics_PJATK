package Zad3;

public class Main {
    public static void main(String[] args)
    {
        Word word = new Word();

        word.show();
        System.out.println();
        word.showAll();
        System.out.println("\nDlugosc: " + word.length());

        word.addChar('a');
        word.addChar('b');
        word.addChar('c');

        word.show();
        System.out.println();
        word.showAll();
        System.out.println("\nDlugosc: " + word.length());
    }
}
