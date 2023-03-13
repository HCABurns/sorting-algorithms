public class insertionSort {

    public void sort(int[] arr){
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

        insertionSort insertionSort= new insertionSort();

    }
}
