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

from cocktailSort import cocktailSort
from gnomeSort import gnomeSort
from oddEvenSort import oddEvenSort
from pancakeSort import pancakeSort
from pigeonholeSort import pigeonholeSort
from radixSort import radixSort
from shellSort import shellSort
from bogoSort import bogoSort


from dataGenerator import generateDataset
import copy

funcs = [bubbleSort,bubbleSortEarlyExit,insertionSort,selectionSort,mergeSort,mergeSortIterative,
         quickSort,countSort,bucketSort,treeSort.treeSort, cocktailSort,gnomeSort,oddEvenSort,
         pancakeSort, pigeonholeSort,radixSort,shellSort]
#bogo sort is not added due to the long exectuion time for large data.


def execute():
    """
    Run an experiment and return the results.

    Return
    -----------
    list - An odered list of tuples containing the name and execution time for a specific function.
    """
    #Generate array
    dataSize = 20000
    minValue = 0
    maxValue = 100000
    arr = generateDataset(dataSize,minValue,maxValue) 
    results = []
    #Execute functions using generated array
    for func in funcs:
        start = time()
        if func.__name__ == "quickSort":
            #if dataSize<=1000:
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
    return sorted(results,key=lambda x:x[0])

if __name__ == "__main__":
    repitions = 10
    rankings = {}
    times = {}

    #Execute the sorting algorithms *repitions* number of times.
    for i in range(1,repitions+1):
        results = execute()
        for rank,pair in enumerate(results,1):
            executionTime,name = pair[0], pair[1]
            if rankings.get(name,False) == False:
                rankings[name] = rank
                times[name] = executionTime
            else:
                rankings[name] += rank
                times[name] += executionTime
        print(f"Repition {i} finished!")

    #Print results in average ranking.    
    for name,ranking in sorted(rankings.items(),key=lambda x:x[1]):
        
        print(f"| {round(ranking/repitions,2)} | {str(name.__name__)} | {round(times[name]*1000/repitions,2)} |" )
        #print(str(name.__name__),f"- {round(ranking/repitions,2)} - {round(times[name]/repitions,2)}")
