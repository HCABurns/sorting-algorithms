import time

def mergeSort(arr):
    """
    This is the mergeSort algorithm. This has been implemented using recursion.

    Time complexity:
        Best case - O(nlogn)
        Average case - O(nlogn)
        Worst case - O(nlogn)
    Space compelxity: O(n)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """

    #Divide
    if len(arr)>1:
        mid = len(arr)//2
        left = mergeSort(arr[:mid])
        right= mergeSort(arr[mid:])
        #Conquer
        i=j=k=0
        while i<len(left) and j<len(right):
            if left[i] <= right[j]:
                arr[k] = left[i]
                i+=1
            else:
                arr[k] = right[j]
                j+=1
            k+=1
        while i<len(left):
            arr[k] = left[i]
            i+=1
            k+=1
        while j<len(right):
            arr[k] = right[j]
            j+=1
            k+=1
    return arr
    

def mergeSortIterative(arr):
    """
    This is the mergeSort algorithm. This has been implemented using an iterative approach.

    Time complexity:
        Best case - O(nlogn)
        Average case - O(nlogn)
        Worst case - O(nlogn)
    Space compelxity: O(n)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    if len(arr) <= 1:
        return arr
    
    n = len(arr)
    size = 1
    while size < n:
        l = 0
        while l < n:
            m = l + size
            r = min(l + 2*size, n)
            if m < r:
                merge(arr, l, m, r)
            l += 2*size
        size *= 2
    return arr


def merge(arr,l,m,r):
    """
    This is the code that is used to merge the arrays together.
    """
    i = l
    j = m
    merged = []
    while i < m and j < r:
        if arr[i] <= arr[j]:
            merged.append(arr[i])
            i += 1
        else:
            merged.append(arr[j])
            j += 1
    while i < m:
        merged.append(arr[i])
        i += 1
    while j < r:
        merged.append(arr[j])
        j += 1
    arr[l:r] = merged    


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    print("Recursive merge sort:")
    start = time.time()
    sortedArr1 = mergeSort(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = mergeSort(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = mergeSort(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

    print("Iterative merge sort:")
    start = time.time()
    sortedArr1 = mergeSortIterative(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = mergeSortIterative(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = mergeSortIterative(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
