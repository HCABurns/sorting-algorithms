import java.util.Arrays;

public class PigeonholeSort {


    static void sort(int[] arr){

        // Define range.
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        // Populate pigeonholes.
        int[] holes = new int[range];
        for (int val : arr) {
            holes[val - min] += 1;
        }

        // Reorder the array
        int idx = 0;
        for (int i =0;i< holes.length;i++){
            for (int j = 0; j<holes[i];j++){
                arr[idx++] = i+min;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        PigeonholeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
