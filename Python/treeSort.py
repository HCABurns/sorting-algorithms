class Node():
    """
    This is the node class. This holds the information for each node in the tree.
    """
    def __init__(self,val=None):
        self.val = val
        self.left = None
        self.right = None
        self.count = 0


def insert_recursive(root,val):
    """
    This function will insert the value to the tree.
    """
    if root == None:
        root = Node(val)
        root.count+=1
        return root

    if val < root.val:
        root.left = insert_recursive(root.left,val)
    elif val > root.val:
        root.right = insert_recursive(root.right,val)
    else:
        root.count+=1
    return root


def treeSort(root,out):
    """
    This is the tree sort algorithm. Tree sort works by constucting a binary tree and traverses it in order.
    A count has been added to allow for duplicate values.
    Time complexity:
        Best case - O(nlogn)
        Average case - O(nlogn)
        Worst case - O(n^2)
    Space compelxity: O(n)

    Parameters
    ------------
    arr - Array containing numbers or letters.

    Return
    ------------
    arr - Array returned.
    """
    if root != None:
        treeSort(root.left,out)
        for _ in range(root.count):
            out.append(root.val)
        treeSort(root.right,out)
        return out

if __name__ == "__main__":
    root = None
    arr = [21,4,65,2,2,5,5,7]
    out = []
    for i in range(len(arr)):
        root = insert_recursive(root,arr[i])
    treeSort(root,out)
    print(out)
