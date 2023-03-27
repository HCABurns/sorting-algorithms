import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSort {

    public void sort(int[] arr){
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

    public void iterativeSort(int arr[]){

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

        mergeSort mergeSort = new mergeSort();
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        mergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{3,6,3,2,6,8,4,2,1,45,3,56,657};
        mergeSort.iterativeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
