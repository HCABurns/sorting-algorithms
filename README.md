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

---

## Results

This section will display the results of the experiments. There are two key pieces of information that is being evaluated in these experiments which are: 

**Average Ranking** - This is the average rank the algorithm achieved when sorting the list. A rank is provided regarding the speed that the algorithm sorts a given list compared to the other algorithms. A rank of 1 is provided to the quickest algorithm and is incremented by 1.

**Execution Time** - This is the time taken for the algorithm to return the sorted list.

An experiment consists of all the sorting algorithms sorted the **same** list and then ranking them based on the execution time. The size of the array is of size 50,000. This process is repeated many times and the results are averaged to produce results. These can be seen below:

### Python Results:

| Avg. Ranking  | Algortihm Name| Avg. Execution time (ms)| 
| ------------- | ------------- | ------------------------|
| 1.0 | PigeonholeSort | 13.25 |
| 2.0 | countSort | 20.55 |
| 3.3 | RadixSort | 38.36 |
| 3.7 | QuickSort | 39.26 |
| 5.0 | MergeSortIterative | 46.86 |
| 6.0 | MergeSort | 61.06 |
| 7.0 | TreeSort | 70.01 |
| 8.0 | BucketSort | 88.16 |
| 9.0 | ShellSort | 99.52 |
| 10.0 | SelectionSort | 7044.87 |
| 11.0 | InsertionSort | 9355.77 |
| 12.3 | BubbleSort | 19146.02 |
| 12.9 | BubbleSortEarlyExit | 19294.98 |
| 13.8 | OddEvenSort | 19606.49 |
| 15.1 | PancakeSort | 27967.98 |
| 15.9 | CocktailSort | 29808.96 |
| 17.0 | GnomeSort | 32875.59 |
| 18.0 | BogoSort | N/A |

*note: A 2 minute timeout was added and bogo sort did not manage to sort any list in any of the expierments* 

### Java Experiment 

| Avg. Ranking  | Algortihm Name| Avg. Execution time (ms)| 
| ------------- | ------------- | ------------------------|
| 1.3| CountingSort|1.16 |
| 1.8| PideonholeSort|1.19 |
| 3.4| RadixSort|3.37 |
| 4.1| QuickSort|3.08 |
| 6.2| MergeSort|8.46 |
| 6.5| ShellSort|6.09 |
| 7.8| TreeSort|8.51 |
| 9.0| MergeSortIterative|15.36 |
| 10.0| InsertionSort|147.20 |
| 10.5| CocktailSort|1134.50 |
| 11.0| SelectionSort|586.80 |
| 12.0| PancakeSort|1288.52 |
| 13.2| OddEvenSort|1535.39 |
| 13.8| GnomeSort|1502.41 |
| 15.0| BucketSort|2147.48 |
| 16.0| BubbleSortEarlyExit|2751.55 |
| 17.0| BubbleSort|2815.05 |
| 18.0| BogoSort | N/A

*note: A 2 minute timeout was added and bogo sort did not manage to sort any list in any of the expierments* 

### Difference in rank between Java and Python.

| Ranking Difference | Algortihm Name| 
| ------------- | ------------- |
| 0.0 | BogoSort | 
| -0.1 | RadixSort | 
| -0.2 | MergeSort |
| -0.4 | QuickSort | 
| 0.6 | OddEvenSort | 
| 0.7 | countSort | 
| -0.8 | PigeonholeSort |
| -0.8 | TreeSort | 
| -1.0 | SelectionSort | 
| 1.0 | InsertionSort | 
| 2.5 | ShellSort | 
| -2.7 | BubbleSort | 
| -3.1 | BubbleSortEarlyExit | 
| 3.1 | PancakeSort |
| 3.2 | GnomeSort | 
| -4.0 | MergeSortIterative |
| 5.4 | CocktailSort |
| -9.0 | BucketSort | 

*Note: Negative values indicate that the algorithm performed better than the other alogirthms in python. Positive indicates that the algorithm performed better than the other alogirthms in java* 

---

### Analysis

The highest average ranking algorithm between Java and Python was PigeonholeSort with 1.4. The worst case time complexity of pidgeonhole sort is O(n+k) where n is the number of items in the list and k is the range that those numbers can take. In this case n is 20,000 and k is 100,000. This gives a value of 120,000. This comes as a surprise, as generally, divide and conquer algorithms such as merge sort or quick sort are thought to be the best sorting algorithms. Using the values given for all the algorithms a O(nlogn) algorithm provides 285,754. This is 2.38x larger than that of the pigeonhole sort. 

The worse performing algorithm for both, Java and Python, was BogoSort. This is due to the nature of the sorting algorithm randomly sorting the algoirthm and checking that it is in order. This is an extemely inefficient method of sorting a list and has a worst case time complexity that is infinite (It may never randomly select the correct order). However, the average time complexity is O(n*n!) which results in a value of 1.87E+162. This is an incredible large number which shows why the algoirthm is extemely poor and unlikely to sort the list in a reasonable amount of time. 

The ranking of 10/17 of the algorithms are all within 1 rank between Java and Python. Of these 10 algorithms 6 performed better in Java, 3 peformed better in Python and 1 was equal ranked in both. The results of the average ranking provides 3 outliers. This includes: MergeSortIterative, CocktailSort and BucketSort. One reason for why BucketSort ranks better in Python than Java is that in the Java implementation the ArrayList structure was used which would increase runtime. 

Out of the 17 algorithms tested, 13 performed better in Java and with 3 performing better in Python *(Note: BogoSort performed equal as it was unable to sort a single algoirthm in a reasonable amount of time)*. Programs are expected to perform better in Java than Python because Java is a complied language whereas Python is a interpretted langauge. 
