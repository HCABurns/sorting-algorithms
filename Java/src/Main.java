import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static int[] generateArr(){

        int[] arr = new int[2000];
        Random random = new Random();

        for (int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(5000);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = generateArr();
        int[] tmp = arr.clone();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        System.out.println("Bubble sort: ");
        bubbleSort bubble = new bubbleSort();
        bubble.bubbleSort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Bubble sort with early exit: ");
        tmp = arr.clone();
        bubble.bubbleSortEarlyExit(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Selection sort: ");
        tmp = arr.clone();
        selectionSort selectionSort = new selectionSort();
        selectionSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Insertion sort: ");
        tmp = arr.clone();
        insertionSort insertionSort = new insertionSort();
        insertionSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Merge sort (Recursive): ");
        tmp = arr.clone();
        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Merge sort (Iterative): ");
        tmp = arr.clone();
        mergeSort.iterativeSort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Tree sort: ");
        tmp = arr.clone();
        TreeSort treeSort = new TreeSort();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSort.Node root = null;
        for (int i:tmp){
            root = treeSort.insert_recursive(root,i);
        }
        treeSort.sort(root,arrayList);
        System.out.println("Sorted: " + (Arrays.equals(sorted, arrayList.stream().mapToInt(i -> i).toArray())));
    }
}
