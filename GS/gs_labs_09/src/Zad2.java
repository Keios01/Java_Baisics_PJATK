public class Zad2
{
    public static void main(String[] args) {
        char[] znaki = new char[5];

        for( int i = 0; i < znaki.length; i++ )
            znaki[i] = (char)(65 + Math.random() * 26);

        // debug
        for (char e : znaki) System.out.println(e);

        java.util.Scanner in = new java.util.Scanner(System.in);

        int licz = 0;

        while( licz < znaki.length )
        {
            char c = in.next().charAt(0);

            for( int i = 0; i < znaki.length; i++ )
            {
                if (znaki[i] == c)
                {
                    znaki[i] = 0;
                    licz++;
                }
            }

            for (char e : znaki) System.out.println(e);
        }
    }
}
