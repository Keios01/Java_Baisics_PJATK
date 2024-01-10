import java.util.Scanner;

public class Labs4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int size = scanner.nextInt();

        size = (size * 2) + 1;

        for(int i = 0, min = size/2, max = size/2; i < size; i++){
            for(int j = 0; j < size; j++){ 
                if(j >= min && j <= max)
                    System.out.print(" *");
                else
                    System.out.print(" .");

            }
            System.out.println();
            if(i < size/2){
                min--;
                max++;
            }else{
                min++;
                max--;
            }
                
            
            
        }

    }
}
