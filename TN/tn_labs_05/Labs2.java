import java.util.Scanner;

public class Labs2 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        while(month < 1 || month > 12){
            System.out.println("Wrong input, please enter number between 1 and 12: ");
            month = scanner.nextInt();
        }

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        int numberOfDays = switch (month){
            case 2 -> ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.println("This month have " + numberOfDays);

    }
}