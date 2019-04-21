package ch2_linked_lists;

public class DeleteNode {
    public boolean deleteNode(ListNode nodeToDel) {
        if (nodeToDel == null || nodeToDel.next == null) {
            return false;
        }

        ListNode nextNode = nodeToDel.next;
        nodeToDel.data = nextNode.data;
        nodeToDel.next = nextNode.next;

        return true;
    }
}