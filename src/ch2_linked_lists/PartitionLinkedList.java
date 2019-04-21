package ch2_linked_lists;

public class PartitionLinkedList {
    public ListNode partition(ListNode head, int val) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode currentSmall = small;
        ListNode currentLarge = large;

        while (head != null) {
            if (head.data < val) {
                // add to the linked list with value less than x
                currentSmall.next = head;
                // move the pointer
                currentSmall = head;
            } else {
                // add to the linked list with values more than x
                currentLarge.next = head;
                // move the pointer
                currentLarge = head;
            }
            // move the head
            head = head.next;
        }
        currentLarge.next = null;
        // add larger linked list to the smaller linked list
        currentSmall.next = large.next; // because 1st element in large ll is 0. Therefore, large.next
        return small.next;
    }
}