public class selectionSort {

    public void sort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int minidx = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = tmp;
        }
    }

    public static void main(String[] args) {
        selectionSort selectionSort = new selectionSort();
    }

}
