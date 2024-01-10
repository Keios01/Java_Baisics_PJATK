/* Present a program that illustrates the basic difference between while and do–while loops */

public class Labs1 {
    public static void main(String [] args){

        boolean x = false;

        do{

            System.out.println("This string will be printed!");

        }while(x == true);

        while (x == true){

            System.out.println("This will be not :c");

        }

        /*
            The do-while loop will always execute at least once,
            even if the condition inside the function is not met.

            The while loop first checks the condition and then
            decides whether it should be executed.

            In this case, the first string will be printed even
            though the condition is not met, the second one
            will not.
         */


    }
}