package ch2_linked_lists;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();

        /*
        push elements from first half of linked list onto stack.
		When fast runner (which is moving at 2x speed) reaches the
		end of the linked list, then we've reached the middle element
		*/
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // if the linked list has odd no of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int lastElement = stack.pop();

            if (slow.data == lastElement) {
                slow = slow.next;
            } else {
                return false;
            }
        }

        return true;
    }
}