package Zad4;

public class Main {
    public static void main(String[] args)
    {
        Phrase phrase = new Phrase();

        phrase.addWordAtEnd("Witaj");
        phrase.addWordAtEnd("swiecie");

        phrase.show();

        phrase.addWordAtEnd("PJATK");

        System.out.println();
        phrase.show();
    }
}
