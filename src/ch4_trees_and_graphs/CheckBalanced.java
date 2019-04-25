package ch4_trees_and_graphs;

public class CheckBalanced {

    private static int height(Node root) {
        // base case -> If node is null, height is 0
        if (root == null) {
            return 0;
        }

        // find height of both left and right subtree
        int left = height(root.left);
        int right = height(root.right);

        // if either side is unabalnced
        if (left == -1 || right == -1) {
            return -1;
        }

        // height diff should not be greater than 1
        if (Math.abs(left - right) > 1) {
            return -1; // the value of -1 (unbalanced tree), will acually be set here
        }

        // increase the height of the sub-tree
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }

    public static boolean isBalanced(Node root) {
        // -1 -> unbalanced
        if (height(root) > - 1) {
            return true;
        }

        return false;
    }

}