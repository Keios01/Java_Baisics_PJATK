import java.util.Scanner;

public class Labs5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three consecutive angles of the triangle: ");
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int k3 = scanner.nextInt();

        if((k1 + k2 + k3) != 180)
            System.out.println("Such a triangle does not exist");
        else
            if(k1 > 90 || k2 > 90 || k3 > 90)
                System.out.println("Such a triangle exists");
            else
                System.out.println("Such an acute-angled triangle exists");
    }
}