import java.util.Arrays;

public class ShellSort {


    static void sort(int[] arr){

        int gap = Math.floorDiv(arr.length,2);
        while (gap > 0){
            int j = gap;
            while (j<arr.length){
                int i = j-gap;
                while (i >= 0){
                    if (arr[i+gap] > arr[i]){
                        break;
                    }
                    else{
                        int tmp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = tmp;
                    }
                    i -= gap;
                }
                j+=1;
            }
            gap = Math.floorDiv(gap,2);;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
