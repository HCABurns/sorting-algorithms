import time

def insertionSort(arr):
    """
    This is the insertion sort code. Insertion sort works by keeping a sorted and unsorted section and one by one insert the values into the sorted array.

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
        key = arr[i]
        j=i-1
        while j>=0 and key<arr[j] :
                arr[j+1] = arr[j]
                j-=1
        arr[j + 1] = key
    return arr


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    start = time.time()
    sortedArr1 = insertionSort(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = insertionSort(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = insertionSort(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
