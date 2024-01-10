public class Zad5 {
    public static void main(String[] args) {
        int a = 300, b = 1000, c = 20000;
        int max = findMax(a, b, c);

        System.out.println(max);
    }

    public static int findMax(int a, int b ,int c){
        int max = a;
        if(a < b || a < c){
            max = b;
            if(b < c) max = c;
        }

        return max;
    }
}
