/**
 * Program Name : Solution143
 * Topic        : LeetCode / Linked List
 * Difficulty   : Medium (143. Reorder List)
 * Concepts     : Middle Finding, List Reversal, Interleaving Nodes
 * -------------------------------------------------------------
 * Description  :
 * Reorders a linked list to L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2... in-place.
 */
public class Solution143 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find Mid
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode curr = slow.next;
        slow.next = null; // Split list into two halves
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Interleave two halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        reorderList(head);

        System.out.print("Reordered List: ");
        printList(head);
    }
}
