public class Zad2 {
    public static void main(String[] args) {
        //int [][] twod = Tools.create2DArr();
        //Tools.fill2DArr(twod, 10);

        int [] tab = {1,2,3,3,4,5};
        destroyThemAll(tab);

        Tools.showTab(tab);


    }

    public static int [] destroyThemAll(int [] tab){
        int count = 0;
    
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < i; j++){

                if(tab[i] == tab[j]){
                    count++;
                }          
            }
        }

        System.out.println(count);
        int [] newArr = new int [tab.length - count];
        boolean spotted = false;

        for(int i = 0, k = 0; i < tab.length; i++){
            for(int j = 0; j < i; j++){
                
                System.out.println(tab[i] + " " + tab[j]);
                if(tab[i] == tab[j]){
                    spotted = true;
                }
               
            }
            if(spotted){
                newArr[k] = tab[i];
                k++;
                spotted = false;
            }
            System.out.println("KONIEC");
        }
        


        return newArr;
    }



    


}
