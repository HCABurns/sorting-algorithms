import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] generateArr(){

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
        BubbleSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Bubble sort with early exit: ");
        tmp = arr.clone();
        BubbleSort.sortEarlyExit(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Selection sort: ");
        tmp = arr.clone();
        SelectionSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Insertion sort: ");
        tmp = arr.clone();
        InsertionSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Merge sort (Recursive): ");
        tmp = arr.clone();
        MergeSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");


        System.out.println("Merge sort (Iterative): ");
        tmp = arr.clone();
        MergeSort.iterativeSort(tmp);
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
        System.out.println("Sorted: " + (Arrays.equals(sorted, arrayList.stream().mapToInt(i -> i).toArray())) + "\n");

        System.out.println("Quick sort (Recursively): ");
        tmp = arr.clone();
        QuickSort.sort(tmp, 0 , tmp.length-1);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Counting sort: ");
        tmp = arr.clone();
        CountingSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Bucket sort: ");
        tmp = arr.clone();
        int buckets = 20;
        BucketSort.sort(tmp,buckets);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Radix sort: ");
        tmp = arr.clone();
        RadixSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Odd-Even sort: ");
        tmp = arr.clone();
        oddEvenSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Pigeonhole sort: ");
        tmp = arr.clone();
        PigeonholeSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Shell sort: ");
        tmp = arr.clone();
        ShellSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Pancake sort: ");
        tmp = arr.clone();
        PancakeSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");



        // ENSURE THAT BOGO SORT IS LAST DUE TO THE LONG TIME COMPLEXITY!
        System.out.println("Bogo sort: ");
        tmp = arr.clone();
        BogoSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

    }
}
