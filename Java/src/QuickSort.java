import java.util.Arrays;

public class QuickSort {

    static void sort(int[] arr, int low, int high)
    {
        /*
         * This is the function that will sort the array using quick sort. Quick sort works similar to merge sort
         * as it is a divide and conquer algorithm however a pivot point is chosen for deciding which side if left
         * and right.
         */
        if (low < high) {
            // Get pivot value
            int pivot = arr[high];
            int i = (low - 1);
            // Values left if smaller than pivot and right if larger.
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //Place in pivot
            int tmp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = tmp;

            //New pivot and call recursively.
            int pi = i+1;
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
