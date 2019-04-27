package ch4_trees_and_graphs;

// in BST, left node is less than the root and greater than the right node
public class LowestCommonAncestorInBST {
    public Node lctInBST(Node root, Node n1, Node n2) {
        if (root.data > Math.max(n1.data, n2.data)) {
            return lctInBST(root.left, n1, n2);
        } else if (root.data < Math.min(n1.data, n2.data)) {
            return lctInBST(root.right, n1, n2);
        } else {
            return root;
        }
    }
}