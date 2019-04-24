package ch4_trees_and_graphs;

class Util {
    /* A utility function to print preorder traversal of BST */
    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
