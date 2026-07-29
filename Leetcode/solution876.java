/**
 * Program Name : solution876
 * Topic        : LeetCode / Linked List
 * Difficulty   : Easy (876. Middle of the Linked List)
 * Concepts     : Fast & Slow Pointer Technique
 * -------------------------------------------------------------
 * Description  :
 * Finds the middle node of a linked list. If there are two middle nodes, returns the second one.
 */
public class solution876 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode mid = middleNode(head);
        System.out.println("Middle Node Value: " + mid.val);
    }
}
