import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        int[] tmp = arr.clone();
        bubbleSort bubble = new bubbleSort();
        bubble.bubbleSort(tmp);
        System.out.println(Arrays.toString(tmp));
        tmp = arr.clone();
        System.out.println(Arrays.toString(arr));

        bubble.bubbleSortEarlyExit(tmp);
        System.out.println(Arrays.toString(tmp));

        tmp = arr.clone();
        selectionSort selectionSort = new selectionSort();
        selectionSort.sort(tmp);
        System.out.println(Arrays.toString(tmp));

        tmp = arr.clone();
        insertionSort insertionSort = new insertionSort();
        insertionSort.sort(tmp);
        System.out.println(Arrays.toString(tmp));

        tmp = arr.clone();
        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(tmp);
        System.out.println(Arrays.toString(tmp));

    }
}
