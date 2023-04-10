# Sorting Algorithms

This is a project to create and evaluate the speed of different algorithms with sets of data. A future evolution of this project will be to compare the results across different programming languages.

## What is a sorting algorithm?

A sorting algoirthm is an alogirthm that will order the elements of a list. Sorting algorithms are often used for lists of values but they can be used for any object using that objects comparison operator. An example of this is strings, they can be organised alphabetically using the ASCII value of characters. Algorithms are associated with a time and space complexity. There are 3 time complexity values that are used to identify the performance of the algorithm and these are: best case, average case, and worst case. This relates to the amount of time the algorithm will take to order a list based on the input in related to the size of the list. It is given in the form of big o notation where n is the length of the list (O(n)). 

## How will algorithms be tested?

Alogithms will be tested by using execution time. The algorithms will be tested using the same data to keep the comparsions fair. Additionally, the tests will be executed many times and averaged, this has been done in order to account for any background tasks interferring with the execution of the algorithms.

## What algorithms will be explored?

The algorithms that have been chosen are a mix of the most commonly used sorting algorithms. A variety of sorting methods are being tested, such as: partitioning, merging, insertion, exchange, and selection. Algorithms will be tested using iterative and recursive methods if available to compare if there is any differences.

Algorithms that have been implemented are:
* Bubble Sort (Python, Java, C++)
* Bubble Sort With Early Exit (Python, Java, C++)
* Selection Sort (Python, Java, C++)
* Insertion Sort (Python, Java)
* Shell Sort (Python, Java)
* Merge Sort (Recursive) (Python, Java)
* Merge Sort (Iterative) (Python, Java)
* Quick Sort (Recursive) (Python, Java)
* Tree Sort (Allows duplicates through count variable) (Python, Java)
* Counting Sort (Python, Java)
* Radix Sort (Python, Java)
* Bucket Sort (Python, Java)
* Odd-Even Sort (Python, Java)
* Pigeonhole Sort (Python, Java)
* Pancake Sort (Python, Java)
* Gnome Sort (Python, Java)
* Cocktail Sort (Python, Java)
* Bogo Sort/Stupid Sort (Python, Java)

## Results

This section will display the results of the experiments. There are two key pieces of information that is being evaluated in these experiments which are: 

**Average Ranking** - This is the average rank the algorithm achieved when sorting the list. A rank is provided regarding the speed that the algorithm sorts a given list compared to the other algorithms. A rank of 1 is provided to the quickest algorithm and is incremented by 1.

**Execution Time** - This is the time taken for the algorithm to return the sorted list.

An experiment consists of all the sorting algorithms sorted the **same** list and then ranking them based on the execution time. The size of the array is randomly selected from between 5000 and 20,000. This process is repeated many times and the results are averaged to produce results. These can be seen below:

### Python Results:

| Avg. Ranking  | Algortihm Name| Avg. Execution time (ms)| 
| ------------- | ------------- | ------------------------|
| 1.0 | quickSort | 0.0 |
| 2.0 | bucketSort | 0.01 |
| 3.33 | radixSort | 0.01 |
| 3.67 | mergeSortIterative | 0.01 |
| 5.0 | pigeonholeSort | 0.01 |
| 6.33 | mergeSort | 0.01 |
| 6.67 | treeSort | 0.01 |
| 8.0 | shellSort | 0.01 |
| 9.0 | countSort | 0.02 |
| 10.0 | selectionSort | 0.07 |
| 11.0 | insertionSort | 0.09 |
| 13.0 | bubbleSort | 0.18 |
| 13.0 | bubbleSortEarlyExit | 0.18 |
| 13.0 | oddEvenSort | 0.18 |
| 15.0 | pancakeSort | 0.26 |
| 16.0 | cocktailSort | 0.28 |
| 17.0 | gnomeSort | 0.31 |
| 18.0 | bogoSort | N/A |

*note: A 2 minute timeout was added and bogo sort did not manage to sort any list in any of the expierments* 
