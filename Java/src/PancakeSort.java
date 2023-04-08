import java.util.Arrays;

public class PancakeSort {


    static int findMax(int[] arr, int idx){

        int maxVal = Integer.MIN_VALUE;
        int maxidx = -1;
        for(int i = 0; i<idx; i++){
            if (arr[i]>maxVal) {
                maxidx = i;
                maxVal = arr[i];
            }
        }
        return maxidx;
    }

    static void flip(int[] arr, int idx){

        int start = 0;
        for (int i = idx; i>0; i--){
            int tmp = arr[i];
            arr[i] = arr[start];
            arr[start] = tmp;
            start+=1;
        }
    }


    static void sort(int[] arr){

        int size = arr.length;
        for(int i= size;i>1;i--){

            int maxidx = findMax(arr,i);
            if (maxidx != i - 1){
                flip(arr,maxidx);
                flip(arr,i-1);

            }
        }

    }


    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        PancakeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
