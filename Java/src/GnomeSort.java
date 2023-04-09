import java.util.Arrays;

public class GnomeSort {


    static void sort(int[] arr){

        int idx = 0;
        while (idx < arr.length){

            if(idx == 0){
                idx+=1;
            }
            if (arr[idx] >= arr[idx-1]){
                idx+=1;
            }
            else{
                int tmp = arr[idx];
                arr[idx] = arr[idx-1];
                arr[idx-1] = tmp;
                idx-=1;
            }
        }

    }


    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        GnomeSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
