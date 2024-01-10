public class Zad6 {
    public static void main(String[] args) {

        
        int[] tabOne = randomArr();
        int[] tabTwo = randomArr();
        int var = 1;
        
        int [] newTab = whateverIsThis(tabOne, tabTwo, var);

        for(int i : newTab){
            System.out.print(i + " ");
        }
    }

    public static int [] whateverIsThis(int [] tabOne, int [] tabTwo, int var){

        if(tabOne.length == tabTwo.length){
            int [] emptyTab = {};
            return emptyTab;
        }  

        // returns the sum of arrays with the same inxexes
        if(var < 0){
            int len = (tabOne.length > tabTwo.length) ? tabTwo.length : tabOne.length;
            int [] addTab = new int[len];

            for(int i = 0; i < addTab.length; i++){
                addTab[i] = tabOne[i] + tabTwo[i];
            }
            return addTab;
        }

        
        else{
            int diff = (int) Math.abs(tabOne.length - tabTwo.length);
            int [] diffTab = new int[diff];

            if(tabOne.length > tabTwo.length){
                for(int i = 0, j = tabOne.length - diff; i < diffTab.length; i++, j++){
                    diffTab[i] = tabOne[j];
                }
            }
            else{
                for(int i = 0, j = tabTwo.length - diff; i < diffTab.length; i++, j++){
                    diffTab[i] = tabTwo[j];
                }  
            }
            return diffTab;
        }   
    }

    // returns the array of randoms size (from 1 to 10) filled with diffrent values from 0 to 100
    public static int [] randomArr(){
        int seed = (int)(Math.random() * 10) + 1;
        int [] arr = new int[seed];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }
}
