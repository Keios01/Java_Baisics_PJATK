public class Labs3 {
    public static void main(String[] args) {
        int n = 4;
        n *= 2;

        for(int i = 0, min = 0, max = n-1; i < n; i++, min++, max--){
            for(int j = 0; j < n; j++){

                if(j == min || j == max)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }

            System.out.println();

        }
    }
}
