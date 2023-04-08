# Imports
import time

def shellSort(arr):
    """
    This is the shell sort code. Shell sort is a variation of insertion sort. It always for swaps to be made that do not require many swaps.
    Time complexity:
        Best case - O(nlogn)
        Average case - O(n^(4/3))
        Worst case - O(n^(3/2))
    Space compelxity: O(1)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    gap=len(arr)//2
    while gap>0:
        j=gap
        while j<len(arr):
            i=j-gap
            while i>=0:
                if arr[i+gap]>arr[i]:
                    break
                else:
                    arr[i+gap],arr[i]=arr[i],arr[i+gap]
                i-=gap           
            j+=1
        gap=gap//2
    return arr


def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    start = time.time()
    sortedArr1 = shellSort(test1)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time.time()
    sortedArr2 = shellSort(test2)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time.time()
    sortedArr3 = shellSort(test3)
    end = time.time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")

if __name__ == "__main__":
    basicTestHarness()
    
