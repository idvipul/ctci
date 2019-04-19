package ch2_linked_lists;

/*
 I/p: 1 -> 2 -> 3 -> 2-> 4 -> 5
 O/p: 1 -> 2 -> 3 -> 4 -> 5
  */

import java.util.HashSet;

public class RemoveDuplicates {
    /*
    with additional buffer (using a hashSet)
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    public void removeDuplicatesWithBuffer(ListNode head) {
        if (head == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        ListNode current = head;
        ListNode previous = null;

        while (current!= null) {
            if (set.contains(current.data)) {
                // remove the duplicate element
                previous.next = current.next;
            } else {
                // add the node to the set
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    /*
    without additional buffer
    Time Complexity: O(n^2)
    Space Complexity: O(1)
     */
    public void removeDupliactesWithoutBuffer(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current!= null) {
            ListNode runner = head;
            while(runner.next != null) {
                if (runner.next.data == current.data) {
                    // remove the duplicate element
                    runner.next = runner.next.next;
                } else {
                    // no duplicates, then just increment the runner to the next node
                    runner = runner.next;
                }
            }
            // now runner has removed all the duplicate element, current will just traverse the nodes
            current = current.next;
        }
    }
}
