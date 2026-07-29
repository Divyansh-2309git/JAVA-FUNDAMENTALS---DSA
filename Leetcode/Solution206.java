/**
 * Program Name : Solution206
 * Topic        : LeetCode / Linked List
 * Difficulty   : Easy (206. Reverse Linked List)
 * Concepts     : Iterative List Reversal, Pointer Manipulation
 * -------------------------------------------------------------
 * Description  :
 * Reverses a singly linked list in O(N) time and O(1) space.
 */
public class Solution206 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode reversed = reverseList(head);
        System.out.print("Reversed List: ");
        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
        System.out.println("null");
    }
}
