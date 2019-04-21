package ch2_linked_lists;

public class LoopDetection {
    public ListNode loopDetection(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow !=null && fast != null && fast.next != null) {
            if (slow.data == fast.data) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }
}
