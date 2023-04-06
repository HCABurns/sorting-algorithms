# Import
from time import time

def pigeonholeSort(arr):
    """
    This is the pigeonhole sort algorithm. This has been implemented using an iterative approach.

    Time complexity:
        Best case - O(n+k)
        Average case - O(n+k)
        Worst case - O(n+k)
    Space compelxity: O(k)
    Where k is the range of the array (max-min+1)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    # Find the min and max then calculate the range.
    minVal = min(arr)
    maxVal = max(arr)
    rangeVal = maxVal - minVal + 1
 
    # Create list of pigeonholes
    holes = [0] * rangeVal
 
    # Populate the pigeonholes.
    for x in arr:
        holes[x-minVal] += 1
 
    # Put the elements back into the array in order.
    i = 0
    for count in range(rangeVal):
        while holes[count] > 0:
            holes[count] -= 1
            arr[i] = count + minVal
            i += 1

             
def basicTestHarness():
    """
    This function is used to test the sort has been implemented correctly.
    """
    test1= [1,2,3,4,5,6,7,9,10]
    test2= [34,564,324,564,786,342,2,34,65]
    test3 = test1[::-1]
    print("Pigeonhole sort:")
    start = time()
    sortedArr1 = pigeonholeSort(test1)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr1}")
    start = time()
    sortedArr2 = pigeonholeSort(test2)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr2}")
    start = time()
    sortedArr3 = pigeonholeSort(test3)
    end = time()
    print(f"Sorted in {end-start}. Result: {sortedArr3}")
if __name__ == "__main__":
    basicTestHarness()
    
