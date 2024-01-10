import java.util.Scanner;

public class Labs4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value: ");
        double val1 = scanner.nextDouble();
        val1 = (int) (val1 * 100);

        System.out.println("Enter second value: ");
        double val2 = scanner.nextDouble();
        val2 = (int) (val2 * 100);

        if(val1 == val2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

    }
}