package ch4_trees_and_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {
// binary tree level order traversal
 public List<List<Integer>> levelOrder(Node root) {
     List<List<Integer>> result = new ArrayList<>(); // resizable array

     if (root == null) {
         return result;
     }

     Queue<Node> queue = new LinkedList<>(); // double linked list
     queue.add(root);

     while (!queue.isEmpty()) {
         int size = queue.size();
         List<Integer> currentLevel = new ArrayList<>();

         for (int i = 0; i < size; i++) {
             // get the node
             Node currentNode = queue.remove();
             // set it to the current level
             currentLevel.add(currentNode.data);

             if (currentNode.left != null) {
                 queue.add(currentNode.left);
             }

             if (currentNode.right != null) {
                 queue.add(currentNode.right);
             }
         }
         // add level to the result
         result.add(currentLevel);
     }

     return result;
 }
}