from time import time

def oddEvenSort(arr):
    """
    This is the mergeSort algorithm. This has been implemented using an iterative approach.

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
    isSorted = False
    while not isSorted:
        isSorted = True
        for i in range(1, len(arr)-1, 2):
            if arr[i]>arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                isSorted = False
                 
        for i in range(0, len(arr)-1, 2):
            if arr[i]>arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                isSorted = False
    return arr

def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    print("Odd even sort:")
    start = time()
    sortedArr1 = oddEvenSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = oddEvenSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = oddEvenSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
