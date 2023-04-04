public class InsertionSort {

    static void sort(int[] arr){
        /*
         * This is the function that will sort the array using insertion sort. Insertion sort works by splitting the
         * array into a sorted and unsorted side. The algorithm iterates through and selects the next item for the
         * sorted array and inputs it into the correct location.
         */
        for (int i = 1; i<arr.length;++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]>key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
    }


    public static void main(String[] args) {

        InsertionSort insertionSort= new InsertionSort();

    }
}
