#include <iostream>
#include "bubbleSort.h"

void printArr(int arr[],int n){
    for (int i = 0; i < n-1; i++)
        std::cout << arr[i] << ", ";
    std::cout << arr[n-1];
}

int main() {
    //Bubble sort code
    int arr[] = {5, 1, 4, 2, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr,n);
    printArr(arr,n);
    std::cout << "\n";

    //Bubble sort with early exit code
    int arr2[] = {5, 1, 4, 2, 8};
    n = sizeof(arr2) / sizeof(arr2[0]);
    bubbleSort(arr2,n);
    printArr(arr2,n);
    std::cout << "\n";

    return 0;
}
