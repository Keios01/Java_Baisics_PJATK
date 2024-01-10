public class InsertionSort
{
    public static void printArray(int[] arr)
    {
        for( int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println("======\n");
    }

    public static void main(String[] args)
    {
        int arrSize = 5, cache;
        int[] arr = new int[arrSize];

        for( int i = 0; i < arrSize; i++ )
            arr[i] = (int)(Math.random() * 100);
        printArray(arr);

        for( int i = 0; i < arrSize; i++ )
        {
            for(int j = i; ( j > 0 && arr[j - 1] > arr[j] ); j--)
            {
                cache = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = cache;
            }
        }
        printArray(arr);
    }
}