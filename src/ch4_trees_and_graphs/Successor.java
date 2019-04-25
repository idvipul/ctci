package ch4_trees_and_graphs;

public class Successor {
    class Node{
        int data;
        Node left, right, parent;

        public Node(int data) {
            this.data = data;
            left = right = parent = null;
        }
    }

    private Node leftMinChild(Node root) {
        // the leftmost node, will be the minimum node
        while (root.left != null) {
            root = root.left;
        }

        return root;

    }

    public Node findInOrderSuccessor(Node root) {
        if (root == null) {
            return null;
        }

        // if right node is not null, then its successor will be the minimum value i.e. leftmost in the right sub-tree
        if (root.right != null) {
            return leftMinChild(root.right);
        } else {
            // if the right subtree is null
            Node currentNode = root;
            Node currentParent = root.parent;

            // Keep traversing up until we reach the root of that tree
            while(currentNode != null && currentNode == currentParent.right) {
                currentNode = currentParent;
                currentParent = currentParent.parent;
            }

            return currentParent;
        }
    }
}