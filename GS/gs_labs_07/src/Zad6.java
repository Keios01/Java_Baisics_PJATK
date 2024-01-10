public class Zad6 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,3,4,5,5,4,3,3,2,1};
        boolean palindrom = true;

        for(int i = 0; i < tab.length / 2 && palindrom; i++)
        {
            if(tab[i] != tab[tab.length - i - 1])
                palindrom = false;
        }

        System.out.println(palindrom);
    }
}
