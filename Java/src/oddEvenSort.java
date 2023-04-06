import java.util.Arrays;

public class oddEvenSort {

    static void sort(int[] arr) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
            for (int i = 1; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }




    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        oddEvenSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
