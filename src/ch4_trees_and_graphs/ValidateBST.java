package ch4_trees_and_graphs;

public class ValidateBST {
    private boolean validateBST(Node root, long minValue, long maxValue) {
        // base case
        if (root == null) {
            return true;
        }

        // when value exceeds lower or uppar bound
        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }

        // set bounds forleft and right subtree recursively
        return validateBST(root.left, minValue, root.data) && validateBST(root.right, root.data, maxValue);
    }


    public boolean isBST(Node root) {
        if (root == null) {
            return true;
        }

        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
