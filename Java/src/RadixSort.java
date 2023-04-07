import java.util.Arrays;

public class RadixSort {

    static void countSort(int[] arr, int exponent){

        int size = arr.length;
        int[] output = new int[size];
        int[] count = new int[10];
        Arrays.fill(count,0);

        // Calculate count of elements
        for (int i = 0; i<size;i++){
            int idx = arr[i] / exponent;
            count[idx % 10] += 1;
        }

        // Calculate cumulative count
        for (int i = 1;i<10;i++){
            count[i] += count[i-1];
        }

        // Place elements into sorted list
        int i = size - 1;
        while (i>=0){
            int idx = arr[i] / exponent;
            output[count[idx % 10] - 1] = arr[i];
            count[idx % 10] -= 1;
            i-=1;
        }
        for (i = 0; i<size;i++){
            arr[i] = output[i];
        }
    }


    static void sort(int[] arr){
        int exponent = 1;
        int max = Arrays.stream(arr).max().getAsInt();
        while (max/exponent >= 1){
            countSort(arr,exponent);
            exponent*=10;
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,234,6,8,4,2,1,23};
        RadixSort.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
