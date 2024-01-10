/*
    The given variables are int day and int month, which need to be initialized to the current one
    date. Write a program that counts how many days have passed since the beginning of the current
    year until now dates.
*/

import java.util.Scanner;

public class Labs4 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter day: ");
        int day = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        for(int i = 1; i < month; i++){
            int addDays = switch (i){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
            sum += addDays;
        }
        System.out.println(sum + (day - 1) + " days have passed");

    }
}