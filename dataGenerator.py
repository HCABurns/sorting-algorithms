import random

def generateDataset(amount,minVal,maxVal):
    """
    This function is used to create a random dataset of integers.

    Parameters
    --------------
    amount : int
        This is the amount of data that will be generated and added to the array.
    minVal : int
        This is the minimum value that can be chosen for an int.
    maxVal : int
        This is the maximum value that can be chosen for an int.

    Return
    --------------
    list - A list of randomly generated values will be returned.
    """
    arr = []
    for i in range(amount):
        arr.append(random.randint(minVal,maxVal))
    return arr
