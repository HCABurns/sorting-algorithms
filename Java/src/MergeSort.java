import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    /*
     * This class is used to sort using the merge sorting algorithm. It works by splitting the array into subarrays
     * then sorting the subarrays and merging them until it is completed.
     */

    static void sort(int[] arr){
        /*
         * This is the function that will sort the array using recursive merge sort.
         */
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        sort(left);
        sort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    static void iterativeSort(int[] arr){
        /*
         * This is the function that will sort the array using iterative merge sort.
         */

        if (arr.length <= 1) {
            return;
        }
        int n = arr.length;
        int size = 1;
        while (size < n) {
            int left = 0;
            while (left < n) {
                int mid = left + size;
                int right = Math.min(left + 2 * size, n);
                if (mid < right) {
                    int i = left;
                    int j = mid;
                    List<Integer> merged = new ArrayList<>();
                    while (i < mid && j < right) {
                        if (arr[i] <= arr[j]) {
                            merged.add(arr[i]);
                            i++;
                        } else {
                            merged.add(arr[j]);
                            j++;
                        }
                    }
                    while (i < mid) {
                        merged.add(arr[i]);
                        i++;
                    }
                    while (j < right) {
                        merged.add(arr[j]);
                        j++;
                    }
                    for (int k = 0; k < merged.size(); k++) {
                        arr[left + k] = merged.get(k);
                    }
                }
                left += 2 * size;
            }
            size *= 2;
        }

    }


    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{3,6,3,2,6,8,4,2,1,45,3,56,657};
        MergeSort.iterativeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
