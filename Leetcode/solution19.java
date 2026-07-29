/**
 * Program Name : solution19
 * Topic        : LeetCode / Linked List
 * Difficulty   : Medium (19. Remove Nth Node From End of List)
 * Concepts     : Two-Pointer Technique, Node Deletion, Linked List Length
 * -------------------------------------------------------------
 * Description  :
 * Removes the N-th node from the end of a singly linked list.
 */
public class solution19 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (size == n) {
            return head.next; // Remove head node
        }

        ListNode prev = head;
        for (int i = 0; i < size - n - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = removeNthFromEnd(head, 2);

        ListNode temp = head;
        System.out.print("List after removing 2nd node from end: ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
