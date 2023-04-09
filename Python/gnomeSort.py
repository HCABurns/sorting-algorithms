# Import
from time import time

def gnomeSort(arr):
    """
    This is the gnome sort algorithm. Swapping algorithm that works by swapping and
    moving back if out of order otherwise continuing.
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
    idx = 0
    while idx < len(arr):
        if idx == 0:
            idx += 1
        if arr[idx] >= arr[idx - 1]:
            idx += 1
        else:
            arr[idx], arr[idx-1] = arr[idx-1], arr[idx]
            idx -= 1
    return arr

def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = [10,9,8,7,6,5,4,3,2,1]
    start = time()
    sortedArr1 = gnomeSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = gnomeSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = gnomeSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
