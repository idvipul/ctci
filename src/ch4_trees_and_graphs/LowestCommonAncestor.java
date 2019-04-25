package ch4_trees_and_graphs;

public class LowestCommonAncestor {
    public Node lca(Node root, Node n1, Node n2) {
        if (root == null) {
            return null;
        }

        if (root == n1 || root == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null && right == null) {
            return null;
        }

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}