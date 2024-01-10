public class Zad3 {
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
    }
}
