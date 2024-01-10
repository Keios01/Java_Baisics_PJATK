public class Zad2 {
    public static void main(String[] args)
    {
        int n = 6;

        for(int i = 0; i < n / 2; i++)
        {
            for(int j = 0; j < n + n / 2; j++)
                if(j % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

            for(int j = 0; j < n + n / 2 - 1; j++)
                if(j % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");

            System.out.println();
        }
    }
}
