public class Zad4
{
    public static void main(String[] args) {
        int[] arr = { 153, 333, 370, 515, 407, 80 };

        for(int i : arr)
        {
            int calc = 0, numberSize = 0;
            int j = i;
            while(j != 0)
            {
                j /= 10;
                numberSize++;
            }

            j = i;
            while(j != 0)
            {
                calc += Math.pow((j % 10), numberSize);
                j /= 10;
            }

            if( calc == i )
                System.out.println(i);
        }
    }
}
