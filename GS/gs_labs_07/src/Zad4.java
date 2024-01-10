import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i = 0; i < size * 2 + 1; i++)
        {
            for(int j = 0; j < size * 2 + 1; j++) {
                if (i <= size)
                {
                    if (j >= size - i && j <= size + i)
                        System.out.print("* ");
                    else
                        System.out.print(". ");
                }
                else
                {
                    if (j < i - size || j > 3 * size - i)
                        System.out.print(". ");
                    else
                        System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
