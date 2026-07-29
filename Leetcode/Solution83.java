/**
 * Program Name : Solution83
 * Topic        : LeetCode / Linked List
 * Difficulty   : Easy (83. Remove Duplicates from Sorted List)
 * Concepts     : Linked List Traversal, Unique Value Enforcement
 * -------------------------------------------------------------
 * Description  :
 * Deletes all duplicates from a sorted linked list.
 */
public class Solution83 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        head = deleteDuplicates(head);
        System.out.print("List after removing duplicates: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
