/* Create a program that reads numbers from the keyboard until the value 0 is entered. Then the program will print on
 the screen the number of entered numbers,and their sum. */

import java.util.Scanner;

public class Labs2 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, x;

        System.out.println("Enter your numbers, end with 0: ");
        do{

            x = scanner.nextInt();
            sum += x;
            count++;

        }while(x != 0);

        System.out.println("Sum of entered numbers: " + sum);
        System.out.println("You'd entered: " + count + " numbers");


    }
}