def counting_sort(arr):
    """
    This is the bubble sort algorithm. Counting sort works by counting the number of instances and using keys to work out the output.
    Time complexity:
        Best case - O(n+k)
        Average case - O(n+k)
        Worst case - O(n+k)
    Space compelxity: O(k)
    (k is the number of keys / max-min value)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """

    minVal = min(arr)
    maxVal = max(arr)
    count_length = maxVal-minVal+1
    count = [0]*(count_length)
    ans = [0]*len(arr)

    #Count number of occurances
    for val in arr:
        count[val-minVal] +=1

    for i in range(1,len(count)):
        count[i] += count[i-1]

    for i in range(len(arr)-1, -1, -1):
        ans[count[arr[i] - minVal] - 1] = arr[i]
        count[arr[i] - minVal] -= 1

    return ans
    

if __name__ == "__main__":
    arr = [1,4,1,2,7,5,2,435,34,56,34,345,6]
    print(counting_sort(arr))
