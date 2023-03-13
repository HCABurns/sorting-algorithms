import time

def quickSort(arr,low,high):
    """
    This is the quick sort code. Quick sort works by selecting a pivot (far right element) and partitioning the array to left and right.
    Left is less than the pivot and right is larger. This is done recursively until the array is sorted.

    Time complexity:
        Best case - O(nlogn)
        Average case - O(nlogn)
        Worst case - O(n^2)
    Space compelxity: O(log)

    Parameters
    ------------
    arr - Array containing numbers or letters.
    low - Integer referring to the index of the left of the unsorted array.
    high - Integer referring to the index of the right of the unsorted array.

    Return
    ------------
    None
    """
    if low < high:
        pivotidx = partition(arr,low,high)
        quickSort(arr,low,pivotidx-1)
        quickSort(arr,pivotidx+1,high)

def partition(arr,low,high):
    """
    This is the partitioning function that is used for quick sort. It will move any values smaller than the pivot value to the left and larger to the right of the pivot.

    Parameters
    ------------
    arr - Array containing numbers or letters.
    low - Integer referring to the index of the left of the unsorted array.
    high - Integer referring to the index of the right of the unsorted array.

    Return
    ------------
    Integer of where the pivot value has ended in the array.
    """
    pivot = arr[high]
    i = low
    for j,val in enumerate(arr[low:high],low):
        if val <= pivot:
            arr[i],arr[j] = arr[j],arr[i]
            i+=1
    arr[i],arr[high] = pivot,arr[i]
    return i


def manualTesting():
    arr = [10,9,8,7,6,5,4,3,2,1]
    arr = [5,3,9,7,10,12,2,1,4]
    returned = quickSort(arr,0,len(arr)-1)
    print(arr)

    arr2 = [23,54,756,435,657,3,45,434,5,5]
    returned = quickSort(arr2,0,len(arr2)-1)
    print(arr2)


if __name__=="__main__":
    manualTesting()


