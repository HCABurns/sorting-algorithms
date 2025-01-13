import java.util.*;

public class Main {

    // Number of algorithms (No recursive algorithms)
    public int algAmount = 17;


    static int[] generateArr(){

        int[] arr = new int[50000];
        Random random = new Random();

        for (int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(100000);
        }
        return arr;

    }


    public HashMap<String, long[]> experiment(){
        // Define required variables.
        HashMap<String,long[]> out = new HashMap<>();
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
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
            System.out.println(executionTime[algNumber]);
        }
        algNumber+=1;

        // Bubble Sort with early exit
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "BubbleSortEarlyExit";
        BubbleSort.sortEarlyExit(tmp);
        System.out.println(Arrays.equals(sorted,tmp));
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Bucket Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "BucketSort";
        BucketSort.sort(tmp,100);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Cocktail Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "CocktailSort";
        CocktailSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Counting Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "CountingSort";
        CountingSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;


        // Gnome Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "GnomeSort";
        GnomeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Insertion Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "InsertionSort";
        InsertionSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Merge Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "MergeSortIterative";
        MergeSort.iterativeSort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Merge Sort Recursively
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "MergeSort";
        MergeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // oddEven sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "OddEvenSort";
        oddEvenSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Pancake Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "PancakeSort";
        PancakeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Pigeonhole Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "PideonholeSort";
        PigeonholeSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // QuickSort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "QuickSort";
        QuickSort.sort(tmp,0,tmp.length-1);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Radix Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "RadixSort";
        RadixSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            System.out.println("RADIX SORTED");
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }

        // Selection sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "SelectionSort";
        SelectionSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Shell Sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "ShellSort";
        ShellSort.sort(tmp);
        if (Arrays.equals(sorted,tmp)){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        // Tree sort
        tmp = arr.clone();
        start = System.nanoTime();
        algName[algNumber] = "TreeSort";
        TreeSort.Node root = null;
        TreeSort treeSort = new TreeSort();
        for (int val:tmp){
            root = treeSort.insert_recursive(root,val);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        treeSort.sort(root,arrayList);
        if (Arrays.equals(sorted, arrayList.stream().mapToInt(i -> i).toArray())){
            executionTime[algNumber] = (long)((System.nanoTime() - start) / Math.pow(10,6));
        }
        algNumber+=1;

        System.out.println(Arrays.toString(algName));
        for(int reps = 1; reps<=this.algAmount;reps++){
            int idx = 0;
            for (int i =0; i<this.algAmount;i++) {
                if (executionTime[i] < executionTime[idx]) {
                    idx = i;
                }
            }
            System.out.println(idx + " " + algName[idx] + " " + executionTime[idx]);
            out.put(algName[idx],new long[]{(long) reps, executionTime[idx]});
            executionTime[idx] = Integer.MAX_VALUE;
        }
        // output is name -> [rank,exeTime]
        return out;
    }


    public static void main(String[] args) {

        // Run the experiments and save a running total of rank and execution time.
        int repetition = 10;
        Main main = new Main();
        HashMap<String, long[]> results = new HashMap<>();
        for (int i = 0; i<repetition;i++) {
            // Get the results
            HashMap<String, long[]> out = main.experiment();
            // Go through each results and update the values.
            for (Map.Entry<String, long[]> entry : out.entrySet()) {
                String algName = entry.getKey();
                long[] value = entry.getValue();
                if (results.containsKey(algName)){
                    results.put(algName, new long[]{(results.get(algName)[0] + value[0]),
                            (results.get(algName)[1] + value[1])});
                }
                else{
                    results.put(algName,value);
                }
            }
            System.out.println("End of Repetition" + i);
        }


        // Convert total to an average
        for(Map.Entry<String, long[]> entry : results.entrySet()) {
            String algName = entry.getKey();
            System.out.println(algName);
            results.put(algName, new long[]{results.get(algName)[0]/repetition,
                    results.get(algName)[1]/repetition});
        }


        // Sort the hashmap and print out in the correct order based on average rank.
        Set<Map.Entry<String, long[]>> entries = results.entrySet();
        Comparator<Map.Entry<String, long[]>> valueComparator = new Comparator<Map.Entry<String,long[]>>() {
            @Override
            public int compare(Map.Entry<String, long[]> o1, Map.Entry<String, long[]> o2) {
                if (o1.getValue()[0]<o2.getValue()[0]){
                    return -1;
                }
                else if (o1.getValue()[0]==o2.getValue()[0]){
                    return 0;
                }
                return 1;
            }
        };

        List<Map.Entry<String, long[]>> listOfEntries = new ArrayList<Map.Entry<String, long[]>>(entries);
        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);


        System.out.println(Arrays.toString(results.get("BubbleSort")));
        System.out.println(Arrays.toString(results.get("BubbleSortEarlyExit")));

        for(Map.Entry<String, long[]> entry : listOfEntries) {
            String algName = entry.getKey();
            long[] value = entry.getValue();
            //if (algName.equals("BubbleSort") || algName.equals("BubbleSortEarlyExit")){
                //System.out.println("Ywaddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
            System.out.println("| " + value[0]
                        + "| " + algName
                        + "|" + (double)Math.round((value[1])*100)/100 + " |");
            //}
            //else{
            //    System.out.println("| " + value[0]
            //            + "| " + algName
            //            + "|" + (double)Math.round((Math.floor(value[1])/Math.pow(10,6))*100)/100 + " |");
            //}
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
