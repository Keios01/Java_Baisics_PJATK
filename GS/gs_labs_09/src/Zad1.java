public class Zad1
{
    public static void main(String[] args)
    {
        char[] znaki = { 'k', 'a', 'b' };

        int min = 0;

        for( int i = 1; i < znaki.length; i++ )
        {
            if( znaki[i] < znaki[min] )
                min = i;
        }

        System.out.println(min);
    }
}