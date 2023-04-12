import java.sql.Time;
import java.util.*;
import java.util.function.LongToDoubleFunction;

public class Main {

    // Number of algorithms (No recursive algorithms)
    public int algAmount = 17;


    static int[] generateArr(){

        int[] arr = new int[1000];
        Random random = new Random();

        for (int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(5000);
        }
        return arr;

    }


    public HashMap<String,Double[]> experiment(){
        // Define required variables.
        HashMap<String,Double[]> out = new HashMap<>();
        String[] algName = new String[this.algAmount];
        long[] executionTime = new long[this.algAmount];
        int[] arr = generateArr();
        int[] tmp = arr.clone();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Execute all the algorithms
        int algNumber = 0;

        // Bubble Sort
        long start = System.nanoTime();
        algName[algNumber] = "BubbleSort";
        BubbleSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Bubble Sort with early exit
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "BubbleSortEarlyExit";
        BubbleSort.sortEarlyExit(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Bucket Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "BucketSort";
        BucketSort.sort(tmp,30);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Cocktail Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "CocktailSort";
        CocktailSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Counting Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "CountingSort";
        CountingSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;


        // Gnome Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "GnomeSort";
        GnomeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Insertion Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "InsertionSort";
        InsertionSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Merge Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "MergeSortIterative";
        MergeSort.iterativeSort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Merge Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "MergeSort";
        MergeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // oddEven sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "OddEvenSort";
        oddEvenSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Pancake Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "PancakeSort";
        PancakeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Pigeonhole Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "PideonholeSort";
        PigeonholeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // QuickSort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "QuickSort";
        QuickSort.sort(tmp,0,tmp.length-1);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Radix Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "RadixSort";
        RadixSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber++] = System.nanoTime() - start;
        }

        // Selection sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "SelectionSort";
        SelectionSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Shell Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "ShellSort";
        ShellSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        // Tree sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "TreeSort";
        TreeSort.Node root = null;
        TreeSort treeSort = new TreeSort();
        for (int i:tmp){
            root = treeSort.insert_recursive(root,i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        treeSort.sort(root,arrayList);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = System.nanoTime() - start;
        }
        algNumber+=1;

        System.out.println(Arrays.toString(executionTime));
        for(int reps = 1; reps<=this.algAmount;reps++){
            int idx = 0;
            for (int i =0; i<this.algAmount;i++) {
                if (executionTime[i] < executionTime[idx]) {
                    idx = i;
                }
            }
            out.put(algName[idx],new Double[]{(double) reps, (double) executionTime[idx]});
            executionTime[idx] = Integer.MAX_VALUE;
        }
        // output is name -> [rank,exeTime]
        return out;
    }


    public static void main(String[] args) {

        int repititions = 5;
        Main main = new Main();
        HashMap<String,Double[]> out = main.experiment();
        for(Map.Entry<String, Double[]> entry : out.entrySet()) {
            String key = entry.getKey();
            Double[] value = entry.getValue();
            System.out.println(key + " " + Arrays.toString(value));
        }

        /*
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

        System.out.println("Gnome sort: ");
        tmp = arr.clone();
        GnomeSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        System.out.println("Cocktail sort: ");
        tmp = arr.clone();
        CocktailSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");




        // ENSURE THAT BOGO SORT IS LAST DUE TO THE LONG TIME COMPLEXITY!
        System.out.println("Bogo sort: ");
        tmp = arr.clone();
        BogoSort.sort(tmp);
        System.out.println("Sorted: " + (Arrays.equals(sorted,tmp)) + "\n");

        */

    }
}
