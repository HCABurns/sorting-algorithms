//
// Created by harry on 20/03/2023.
//

#include "bubbleSort.h"

void bubbleSort(int arr[], int n){
    /*
     * This function is used to perform a bubble sort in place.
     */
    for (int i = 0; i < (n); i++) {
        for (int j = i;j<n-1;j++){
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}

void bubbleSortEarlyExit(int arr[],int n){
    /*
     * This function is used to perform a bubble sort in place with early exit.
     */
    for (int i = 0; i < (n); i++) {
        bool noSwaps = true;
        for (int j = i;j<n-1;j++){
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                noSwaps = false;
            }
        }
        if (noSwaps)
            break;
    }
}
