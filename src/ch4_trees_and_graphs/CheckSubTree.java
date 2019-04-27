package ch4_trees_and_graphs;

public class CheckSubTree {
    public boolean isSubtree(Node t1Root, Node t2Root) {
        if (t2Root == null) {
            // the empty tree is a subtree of every tree
            return true;
        } else {
            return containsTree(t1Root, t2Root);
        }
    }

    // checks if the binary tree rooted at t1 contains the binary tree rooted at t2 as a subtree somewhere within it
    private boolean containsTree(Node t1Root, Node t2Root) {
        if (t1Root == null) {
            // big tree is empty, so subtree will not be present there
            return false;
        } else if (t1Root == t2Root) {
            // if root of both the trees are same, check their left and right subtree
            if (matchesTree(t1Root, t2Root)) {
                return true;
            }
        }

        // keep moving down and check if left subtree or right subtree contains the given t2Root
        return containsTree(t1Root.left, t2Root) || containsTree(t1Root.left, t2Root);
    }

    // Checks if the binary tree rooted at t1 contains the binary tree rooted at t2 as a subtree starting at t1
    private boolean matchesTree(Node t1Root, Node t2Root) {
        // nothing left in the subtree
        if (t1Root == null && t2Root == null) {
            return true;
        }

        // if one is null, they are not equal
        if (t1Root == null || t2Root == null) {
            return false;
        }

		// if they match, keep moving down and check if left subtree or right subtree contains the given T2
        return matchesTree(t1Root.left, t2Root.left) && matchesTree(t1Root.right, t2Root.right);
    }
}