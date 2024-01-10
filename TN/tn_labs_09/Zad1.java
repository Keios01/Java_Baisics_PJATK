public class Zad1 {
    public static void main(String[] args) {
        int [][] tab = {{1,0,0,0,0},{0,1,0,0}, {0,0,1}};
        
        int count = 0;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                count++;
            }
        }

        int [] onedTab = new int [count];

         for(int i = 0, k = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                onedTab[k] = tab[i][j];
                k++;
            }
        }

        for(int i : onedTab){
            System.out.print(i + " ");
        }

    }    
}