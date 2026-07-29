/**
 * Program Name : solution141
 * Topic        : LeetCode / Linked List
 * Difficulty   : Easy (141. Linked List Cycle)
 * Concepts     : Floyd's Tortoise and Hare Cycle Detection Algorithm
 * -------------------------------------------------------------
 * Description  :
 * Determines if a linked list contains a cycle using slow and fast pointers.
 */
public class solution141 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creates cycle

        System.out.println("Linked List contains cycle? " + hasCycle(head));
    }
}
