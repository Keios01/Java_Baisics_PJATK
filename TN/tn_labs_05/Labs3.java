import java.util.Scanner;

public class Labs3 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter char: ");
        char ch = scanner.next().charAt(0);

        String isVowel = switch (ch){
            case 'a', 'i', 'e', 'o', 'u', 'y' -> "a vowel";
            default -> "not a vowel";
        };

        System.out.println("Your char is " + isVowel);

    }
}