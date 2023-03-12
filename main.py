import time
from bubbleSort import bubbleSort
from bubbleSort import bubbleSortEarlyExit
from insertionSort import insertionSort
from selectionSort import selectionSort
from mergeSort import mergeSort

funcs = [bubbleSort,bubbleSortEarlyExit,insertionSort,selectionSort,mergeSort]
if __name__ == "__main__":
    a = [2,3,1,34,45,564,342,34,6,1]
    for func in funcs:
        start = time.time()
        temp = a
        sort = func(temp)
        end = time.time()
        print(str(func.__name__),f"- in {end-start}s -" ,sort)

