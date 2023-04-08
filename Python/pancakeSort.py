# Import
from time import time

def pancakeSort(arr):
    """
    This is the pancake sort code.
    Pancake sort is similar to selection sort. By placing the max value at the end of the array and
    then reducing the array by 1, until it's sorted.

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
    size = len(arr)
    for i in range(size,0,-1):
        maxidx = findMax(arr[0:i])
        if maxidx != i-1:
            flip(arr,maxidx)
            flip(arr,i-1)
    return arr


def findMax(arr):
    """
    This function is used to find the max value in a list and return it's
    location in the array.

    Parameters
    -------------
    arr : list
        List that will be reverse.

    Return
    -------------
    int - Integer that refers to the location in the list of the max element.
    """
    maxVal = -99999999999999
    idx = -1
    for i,val in enumerate(arr):
        if val>maxVal:
            maxVal = val
            idx = i
    return idx


def flip(arr,idx):
    """
    This function is used to flip the arr from 0 to idx.

    Parameters
    -------------
    arr : list
        List that will be reverse.
    idx : int
        This is the max that will be used in the array.
    """
    start = 0
    for i in range(idx,0,-1):
        arr[i],arr[start] = arr[start],arr[i]
        start+=1
    




def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    print("Pancake sort:")
    start = time()
    sortedArr1 = pancakeSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = pancakeSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = pancakeSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
