import java.util.Arrays;

public class CocktailSort {


    static void sort(int[] arr){

        int idx = 0;
        boolean swaps = true;

        while (swaps){
            swaps = false;
            while (idx < arr.length-1){
                if (arr[idx] > arr[idx+1]){
                    int tmp = arr[idx];
                    arr[idx] = arr[idx+1];
                    arr[idx+1] = tmp;
                    swaps = true;
                }
                idx+=1;
            }

            if (!swaps){
                break;
            }

            while (idx > 0){
                if (arr[idx] < arr[idx-1]){
                    int tmp = arr[idx];
                    arr[idx] = arr[idx-1];
                    arr[idx-1] = tmp;
                    swaps = true;
                }
                idx-=1;
            }

        }

    }


    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        CocktailSort.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
