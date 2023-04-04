import java.util.Arrays;

public class CountingSort {
    /*
     * Counting sort is a sorting algorithm that uses keys and arithmetic to sort an array of numbers.
     */

    static void sort(int[] arr)
    {
        /*
         * This is the function that will sort the array using counting sort.
         */
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        for (int j : arr) {
            count[j - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        CountingSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
