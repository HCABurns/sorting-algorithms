import java.util.Arrays;

public class BubbleSort {
    /*
     * This class is used to sort using the bubble sort sorting algorithm. It works by comparing adjacent elements and
     * swapping them if they're in the wrong order.
     */

    static void sort(int[] arr){
        /*
         * This is the function that will sort the array using bubble sort.
         */
        for (int i =0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void sortEarlyExit(int[] arr){
        /*
         * This is the function that will sort the array using bubble sort with an early exit clauses.
         */
        for (int i =0;i<arr.length;i++) {
            boolean swaps = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swaps=true;
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            if (!swaps) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
