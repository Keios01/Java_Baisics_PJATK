/*
    Write a program that determines whether the number drawn by the computer is correct
    in the range of numbers provided by the user. The user enters two ends (integers) of
    the range of numbers [a, b] (assuming that a < b and a, b < 100). Program draws an
    integer from the interval [0,100). If the number drawn is outside interval [a, b],
    the program displays a message in the form: The drawn number is ...,it is outside the range [..., ...].
    The program repeats the above-mentioned operation until an integer is drawn from
    the interval [a, b], then displays information about the number drawn and the number
    of failed attempts.

 */

import java.util.Scanner;

public class Labs5 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int start, end, guess = 0;

        String instruction1 = "Describe the beginning of the interval by entering a number from 1 to 100:";
        String instruction2= "Describe the beginning of the interval by entering a number bigger than the begging of interval, but smaller, than 100:";

        do{
            System.out.println(instruction1);
            start = scanner.nextInt();
            instruction1 = "Wrong input! try again.";

        }while(start < 0 || start > 100);

        do{
            System.out.println(instruction2);
            end = scanner.nextInt();
            instruction2 = "Wrong input! try again.";

        }while(end < start || end > 100);

        int rand = (int) (Math.random() * 100);

        while(rand < start || rand > end){
            System.out.println("The drawn number is " + rand + " ,it is outside the range [" + start + "," + end + "].");
            rand = (int) (Math.random() * 100);
            guess++;
        }

        System.out.println("Correct guess is: " + rand + ". Number of failed attempts: " + guess);


    }
}