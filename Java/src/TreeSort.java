import java.util.ArrayList;

public class TreeSort {

    public class Node{
        Node left;
        Node right;
        int value;
        int count;

        private Node(int val){
            left = null;
            right = null;
            value = val;
            count = 1;
        }
    }


    public Node insert_recursive(Node root, int val){
        /*
         * This function will add the node into the right place, or will increment the counter. (Allow for duplicates)
         */
        if (root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if (val < root.value){
            root.left = insert_recursive(root.left,val);
        }
        else if (val > root.value){
            root.right = insert_recursive(root.right,val);
        }
        else{
            root.count+=1;
        }
        return root;
    }


    public void sort(Node root, ArrayList<Integer> out){
        /*
         * This is the function that will sort the array using tree sort.
         */
        if (root != null){
            sort(root.left,out);
            for(int i = 0; i<root.count; i++) {
                out.add(root.value);
            }
            sort(root.right,out);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        TreeSort treeSort = new TreeSort();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ints = new int[]{10,4,3,45,436,65,5,34};
        for (int i:ints){
            root = treeSort.insert_recursive(root,i);
        }
        System.out.println(root.right);
        treeSort.sort(root,arr);
        System.out.println(arr);
    }

}
