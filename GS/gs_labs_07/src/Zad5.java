public class Zad5 {
    public static void main(String[] args) {
        double arr[] = new double[10];

        for(int i = 0; i < arr.length; i++)
            arr[i] = (100 * Math.random());

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for(int i = 0; i < arr.length; i+=2)
            System.out.print(arr[i] + " ");

        System.out.println();

        for(int i = 0; i < arr.length; i++)
            if((int)arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
    }
}
