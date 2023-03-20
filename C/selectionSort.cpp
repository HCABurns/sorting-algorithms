//
// Created by harry on 20/03/2023.
//

void selectionSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        int minIdx = i;
        for (int j = i+1; j<n;j++){
            if (arr[minIdx] > arr[j]){
                minIdx = j;
            }
        }
        int tmp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = tmp;
    }
}

