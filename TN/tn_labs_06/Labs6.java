/*
    Write a program that initializes a variable of type long with a positive natural value and
    outputs to the console the greatest divisor, which is a prime number, of the given value.
 */

public class Labs6 {
    public static void main(String [] args){

        long val = 176546L, result = 0;
        boolean isBiggest = false;
            for(long i = val/2; i > 0 && isBiggest == false; i--){
            if(isPrime(i)){
                result = i;
                isBiggest = true;
            }
        }
        System.out.println(result);
    }

    static boolean isPrime(long n){
        if( n <= 1) {
            return false;
        }

        for(int i=2 ; i<=n/2 ; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}

