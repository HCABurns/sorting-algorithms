# Imports
from time import time
from mergeSort import mergeSort

def countingSort(array, exponent):
    """
    This is a altered version of counting sort.

    Parameters
    -----------------
    arr : list
        This is the list to be sorted.
    exponent : int
        This is the exponent to be used.
    """
    size = len(array)
    output = [0] * size
    count = [0] * 10

    # Calculate count of elements
    for i in range(0, size):
        index = array[i] // exponent
        count[index % 10] += 1

    # Calculate cumulative count
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Place the elements in sorted order
    i = size - 1
    while i >= 0:
        index = array[i] // exponent
        output[count[index % 10] - 1] = array[i]
        count[index % 10] -= 1
        i -= 1

    for i in range(0, size):
        array[i] = output[i]

def radixSort(arr):
    """
    This is the radix sort algorithm. This words by ...

    Time complexity:
        Best case - O()
        Average case - O()
        Worst case - O()
    Space compelxity: O()

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    exponent = 1
    maxVal = max(arr)
    while maxVal / exponent >=1:
        countingSort(arr,exponent)
        exponent*=10
    return arr

def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    print("Radix sort:")
    start = time()
    sortedArr1 = radixSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = radixSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = radixSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")


if __name__ == "__main__":
    basicTestHarness()
    
