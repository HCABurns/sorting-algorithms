import java.util.Arrays;

public class bubbleSort {

    public void bubbleSort (int[] arr){
        for (int i =0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


    public void bubbleSortEarlyExit (int[] arr){
        for (int i =0;i<arr.length;i++) {
            boolean swaps = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swaps=true;
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            if (!swaps) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort bubbleSort = new bubbleSort();
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
