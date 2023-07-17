import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {
    static void sort(int[] arr, int n){

        // Create buckets.
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0 ; i<n;i++){
            ArrayList<Integer> bucket = new ArrayList<>();
            buckets.add(bucket);
        }

        // Fill the buckets
        int max = Arrays.stream(arr).max().getAsInt();
        for(int val : arr){
            int idx = (int)(Math.floor((val*n)/max));
            if (idx == n){
                buckets.get(idx-1).add(val);
            }
            else{
                buckets.get(idx).add(val);
            }
        }

        // Sort buckets using insertion sort.
        int idx = 0;
        for (ArrayList bucket : buckets){
            int[] sortedBucket = bucket.stream().mapToInt(i -> (int) i).toArray();
            InsertionSort.sort(sortedBucket);
            for (int i = 0;i<sortedBucket.length;idx++,i++){
                arr[idx] = sortedBucket[i];
            }
        }

    }
    public static void main(String[] args) {

        int[] arr = new int[]{3,6,3,2,6,8,4,2,1};
        int buckets = 2;
        BucketSort.sort(arr,buckets);
        System.out.println(Arrays.toString(arr));


    }
}
