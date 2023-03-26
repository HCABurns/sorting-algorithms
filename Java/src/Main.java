import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        int[] tmp = arr.clone();
        System.out.println("Bubble sort: ");
        bubbleSort bubble = new bubbleSort();
        bubble.bubbleSort(tmp);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));

        System.out.println("Bubble sort with early exit: ");
        tmp = arr.clone();
        System.out.println(Arrays.toString(arr));
        bubble.bubbleSortEarlyExit(tmp);
        System.out.println(Arrays.toString(tmp));

        System.out.println("Selection sort: ");
        tmp = arr.clone();
        selectionSort selectionSort = new selectionSort();
        selectionSort.sort(tmp);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));

        System.out.println("Insertion sort: ");
        tmp = arr.clone();
        insertionSort insertionSort = new insertionSort();
        insertionSort.sort(tmp);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));

        System.out.println("Merge sort: ");
        tmp = arr.clone();
        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(tmp);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));

        System.out.println("Tree sort: ");
        tmp = arr.clone();
        TreeSort treeSort = new TreeSort();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSort.Node root = null;
        for (int i:tmp){
            root = treeSort.insert_recursive(root,i);
        }
        treeSort.sort(root,arrayList);
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);

    }
}
