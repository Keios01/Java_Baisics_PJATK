public class Zad4 {
    public static void main(String[] args) {
        int wrt = 5;
        
        modifyValue(wrt);

        System.out.println("Wrt: " + wrt);

    }

    public static void modifyValue(int number){
        System.out.println(number);
        number = number * 5;
        System.out.println(number);



    }
}
