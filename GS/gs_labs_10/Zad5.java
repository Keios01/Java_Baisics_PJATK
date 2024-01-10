public class Zad5
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Największa wartość:");
        Print.show(findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c)
    {
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }
}