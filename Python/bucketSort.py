#Time import for measuring how fast the algorithms are.
import time
from insertionSort import insertionSort

def bucketSort(arr, n):
    """
    This is the bucket sort algorithm. It works by 
    Time complexity:
        Best case - O(n+k)
        Average case - O(n+k)
        Worst case - O(n^2)
        (k is the number of buckets, n being number of elements)
    Space complexity: O(n)

    Parameters
    ----------------
    arr : list
        The list to be sorted.
    n : int
        This is the number of buckets that will be used.

    Return
    ----------------
    list - Returns sorted list.
    """
    # Create n buckets.
    buckets = []
    for _ in range(n):
        buckets.append([])

    #Fill buckets
    maxVal = max(arr)
    for i in range(0,len(arr)):
        bucket = (n * arr[i]) // maxVal
        if bucket == n:
            buckets[n-1].append(arr[i])
        else:
            buckets[(n * arr[i]) // maxVal].append(arr[i])

    #Sort each bucket (Using insertion sort)
    i = 0
    for bucket in buckets:
        insertionSort(bucket)
        #Replace arr with sorted buckets.
        for val in bucket:
            arr[i] = val
            i+=1
    return arr

def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324]
    test3 = [10,9,8,7,5,3,5,9,6,5]
    start = time.time()
    sortedArr1 = bucketSort(test1,5)
    end = time.time()
    print(test1)
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = bucketSort(test2,5)
    end = time.time()
    print(test2)
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = bucketSort(test3,5)
    end = time.time()
    print(test3)
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
