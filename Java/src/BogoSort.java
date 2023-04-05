import java.util.Random;

public class BogoSort {
    /*
     * This is the bogo sort algorithm. It works by randomly permuting the list until the list is ordered.
     * Time complexity:
     *                 Best case - O(n)
     *                 Average case - O(n*n!)
     *                 Worst case - O(∞)
     * Space complexity: O(1)
     */

    static void sort(int[] arr){
        // Iteratively permute the array until it is ordered.
        while (!isSorted(arr)){
            permute(arr);
        }
    }

    static boolean isSorted(int[] arr){
        // Iterate through the array and check adjacent elements are in the correct order.
        //
        // Return: True if ordered and false otherwise.
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    static void permute(int[] arr){
        Random random = new Random();
        // Iterate through the entire array.
        for (int i = 0; i<arr.length;i++){
            // Swap two random elements
            int idx = random.nextInt(arr.length-1);
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }

    }


    public static void main(String[] args) {

    }
}
