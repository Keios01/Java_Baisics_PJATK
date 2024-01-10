import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        boolean dec = true;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter your numner: ");

            int number = scanner.nextInt();

            System.out.print("Your number is: ");
            show(number);

            System.out.println();

            System.out.println("Do you want to enter another number? [y/n]");

            String answer = scanner.next();

            while(!("n".equals(answer)) && !("y".equals(answer))){
                System.out.println("Wrong intput, please enter ethier [t] or [n]");
                answer = scanner.next();
            }

            if(answer.equals("n")) dec = false;
           
        }while(dec);

    }

    public static void show(int number){

        System.out.print(number);

    }
}
