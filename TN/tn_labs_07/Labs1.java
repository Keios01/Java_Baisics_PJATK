import java.util.Scanner;

public class Labs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 0, pow = 1; j < 4; j++, pow++){
                System.out.print(((int) Math.pow(i, pow)) + " ");
            }
            System.out.println();

        }
    }
}