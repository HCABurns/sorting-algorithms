import time
from bubbleSort import bubbleSort
from bubbleSort import bubbleSortEarlyExit
from insertionSort import insertionSort
from selectionSort import selectionSort
from mergeSort import mergeSort
from quickSort import quickSort
from dataGenerator import generateDataset
import copy

funcs = [bubbleSort,bubbleSortEarlyExit,insertionSort,selectionSort,mergeSort,quickSort]

if __name__ == "__main__":
    #Generate array
    dataSize = 25000
    minValue = 0
    maxValue = 100000
    arr = generateDataset(dataSize,minValue,maxValue) 
    results = []
    #Execute functions using generated array
    for func in funcs:
        start = time.time()
        if func.__name__ == "quickSort":
            if dataSize<=1000:
                func(copy.deepcopy(arr),0,len(a)-1)
        else:
            sort = func(copy.deepcopy(arr))
        end = time.time()
        if sort ==sorted(arr):
            results.append((end-start,func))
        else:
            print(func.__name__, " failed to sort!")

    #Print results in order of least execution time.
    results = sorted(results,key=lambda x:x[0])
    for time,func in results:
        print(str(func.__name__),f"- in {round(time,3)}s")
