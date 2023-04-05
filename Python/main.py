from time import time
from bubbleSort import bubbleSort
from bubbleSort import bubbleSortEarlyExit
from insertionSort import insertionSort
from selectionSort import selectionSort
from mergeSort import mergeSort
from mergeSort import mergeSortIterative
from bucketSort import bucketSort
from quickSort import quickSort
from countSort import countSort
import treeSort
from dataGenerator import generateDataset
import copy

funcs = [bubbleSort,bubbleSortEarlyExit,insertionSort,selectionSort,mergeSort,mergeSortIterative,quickSort,countSort,bucketSort,treeSort.treeSort]
#bogo sort is not added due to the long exectuion time for large data.
if __name__ == "__main__":
    #Generate array
    dataSize = 999
    minValue = 0
    maxValue = 100000
    arr = generateDataset(dataSize,minValue,maxValue) 
    results = []
    #Execute functions using generated array
    for func in funcs:
        start = time()
        if func.__name__ == "quickSort":
            if dataSize<=1000:
                func(copy.deepcopy(arr),0,len(arr)-1)
        elif func.__name__ == "bucketSort":
            sort = func(copy.deepcopy(arr),100)
        elif func.__name__ == "treeSort":
            root = None
            for i in range(len(arr)):
                root = treeSort.insert_recursive(root,arr[i])
            sort = []
            func(root,sort)
        else:
            sort = func(copy.deepcopy(arr))
        end = time()
        if sort ==sorted(arr):
            results.append((end-start,func))
        else:
            print(func.__name__, " failed to sort!")

    #Print results in order of least execution time.
    results = sorted(results,key=lambda x:x[0])
    for time,func in results:
        print(str(func.__name__),f"- in {round(time,3)}s")
