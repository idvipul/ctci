package ch2_linked_lists;

public class FindNthToLast {
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
     */
    public ListNode nThToLast(ListNode head, int n) {
        if (n <= 0) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        // traverse p1 till nth position
        for(int i = 0; i < n; i++) {
            if (p1 == null) {
                return null; // n is smaller than the ll
            }
            p1 = p1.next;
        }

        if (p1 == null) { // error check
            return null;
        }

        // when p1 has reached the end, p2 will reach the nth position
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}