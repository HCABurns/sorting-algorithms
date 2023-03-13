
#Time import for measuring how fast the algorithms are.
import time

def bubbleSort(arr):
    """
    This is the bubble sort algorithm. Bubble sort occurs in place and will compare and swap adjacent elements.
    Time complexity:
        Best case - O(n^2)
        Average case - O(n^2)
        Worst case - O(n^2)
    Space compelxity: O(1)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    n = len(arr)
    for i in range(n):
        for j in range(n-i-1):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]
    return arr

def bubbleSortEarlyExit(arr):
    """
    This is the bubble sort algorithm with an early exit clause. 

    Time complexity:
        Best case - O(n)
        Average case - O(n^2)
        Worst case - O(n^2)
    Space compelxity: O(1)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    n = len(arr)
    for i in range(n):
        swaps = False
        for j in range(n-i-1):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]
                swaps = True
        if swaps == False:
            return arr
    return arr

def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = [10,9,8,7,6,5,4,3,2,1]
    start = time.time()
    sortedArr1 = bubbleSort(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = bubbleSort(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = bubbleSort(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
