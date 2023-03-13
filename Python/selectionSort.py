#Time import for measuring how fast the algorithms are.
import time

def selectionSort(arr):
    """
    This is the selection sort algorithm. Selection sort works by selecting the smallest value from the the sorted section and placing it in the correct place and repeating.

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
    n= len(arr)
    for i in range(n):
        minIndex = i
        for j in range(i,n):
            if arr[j] < arr[minIndex]:
                minIndex = j
        arr[i],arr[minIndex] = arr[minIndex],arr[i]
    return arr


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = [10,9,8,7,6,5,4,3,2,1]
    start = time.time()
    sortedArr1 = selectionSort(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = selectionSort(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = selectionSort(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")


if __name__ == "__main__":
    basicTestHarness()