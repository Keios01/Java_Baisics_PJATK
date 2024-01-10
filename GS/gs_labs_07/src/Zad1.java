// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zad1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3) + " " + Math.pow(i, 4));
        }
    }
}