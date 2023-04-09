# Imports
from time import time


def cocktailSort(arr):
    """
    This is the cocktail sort algorithm. It works by comparing elements
    traversing both forwards and backwards amd swapping out of order
    elements until the list is sorted.

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
    swaps = True
    while swaps:
        swaps = False
        while idx < len(arr)-1:
            if arr[idx] > arr[idx+1]:
                arr[idx],arr[idx+1] = arr[idx+1],arr[idx]
                swaps = True
            idx+=1

        if swaps == False:
            return arr

        while idx >= 1:
            if arr[idx] < arr[idx-1]:
                arr[idx],arr[idx-1] = arr[idx-1],arr[idx]
                swaps = True
            idx-=1


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = [10,9,8,7,6,5,4,3,2,1]
    start = time()
    sortedArr1 = cocktailSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = cocktailSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = cocktailSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
