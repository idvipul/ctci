package ch4_trees_and_graphs;

public class MinimalTree {

    public static Node MinimalTree(int[] array, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(array[mid]);

        root.left = MinimalTree(array, start, mid - 1);
        root.right = MinimalTree(array, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int end = arr.length - 1;
        Node root = MinimalTree(arr, 0, end);
        System.out.println("Preorder traversal of constructed BST");
        Util.preOrder(root);
    }
}