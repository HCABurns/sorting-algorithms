#Time import for measuring how fast the algorithms are.
import time
#Import randint to get a random index to swap with.
from random import randint

def bogoSort(arr):
    """
    This is the bogo sort algorithm. It works by randomly permuting the list
    until the list is ordered.
    Time complexity:
        Best case - O(n)
        Average case - O(n*n!)
        Worst case - O(∞)
    Space complexity: O(1)
    """
    while isSorted(arr) == False:
        permute(arr)
        

def isSorted(arr):
    """
    This function will check if the list is sorted or not.
    Checks if it sorted linearly. O(n)

    Parameters
    ---------------
    arr : list
        This is the list to check if is sorted or not.

    Return
    ---------------
    boolean - True if sorted, otherwise False.
    """
    if len(arr) == 1 or len(arr)==0:
        return True
    else:
        for i in range(0,len(arr)-1):
            if arr[i] > arr[i+1]:
                return False
    return True


def permute(arr):
    """
    This function will random permute the given array.

    Parameters
    ---------------
    arr : list
        This is the list to permute.
    """
    for i in range(len(arr)):
        idx = randint(0,len(arr)-1)
        arr[i] , arr[idx] = arr[idx] , arr[i]


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324]
    test3 = [10,9,8,7,5,3,5,9,6,5]
    start = time.time()
    sortedArr1 = bogoSort(test1)
    end = time.time()
    print(test1)
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = bogoSort(test2)
    end = time.time()
    print(test2)
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = bogoSort(test3)
    end = time.time()
    print(test3)
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
