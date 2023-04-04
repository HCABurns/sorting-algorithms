public class SelectionSort {

    static void sort(int[] arr){
        /*
         * This is the function that will sort the array using selection sort. Selection sort works by finding the
         * smallest element from the unsorted side and placing it in the correct place by swapping.
         */
        for (int i = 0;i<arr.length;i++){
            int minidx = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = tmp;
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
    }

}
