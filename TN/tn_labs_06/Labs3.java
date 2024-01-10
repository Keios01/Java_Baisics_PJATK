/*  Create a program that reads a number representing your student index from the keyboard. Then display the
    sum of the numbers from 0 to the entered student number. */

import java.util.Scanner;

public class Labs3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your index: ");
        int index = scanner.nextInt();
        int sum = 0;

        for(int i = index; i > 0; i--)
            sum += i;

        System.out.println(sum);

    }
}