import java.util.ArrayList;
import java.util.Arrays;
public class mergeSort {

    public int[] sort(int[] arr){

        //Divide
        if (arr.length <= 1){
            return arr;
        }
        int mid = (int) Math.floor(arr.length/2);
        System.out.println(mid);
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid+1,arr.length));
        System.out.println(Arrays.toString(left) + " " + Arrays.toString(right));
        //Conquer
        int i =0;
        int j =0;
        int k = 0;
        while (i<left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i+=1;
            }
            else{
                arr[k] = right[j];
                j+=1;
            }
            k+=1;
        }
        while (i<left.length){
            arr[k] = left[i];
            i+=1;
        }
        while (j<right.length){
            arr[k] = left[j];
            j+=1;
        }
        System.out.println((Arrays.toString(arr)));
        return arr;
    }



    public static void main(String[] args) {

        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(new int[]{3,6,3,2,6,8,4,2,1});


    }
}
