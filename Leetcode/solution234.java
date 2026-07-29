/**
 * Program Name : solution234
 * Topic        : LeetCode / Linked List
 * Difficulty   : Easy (234. Palindrome Linked List)
 * Concepts     : Two Pointers, Mid Finder, Sub-list Reversal
 * -------------------------------------------------------------
 * Description  :
 * Determines if a singly linked list is a palindrome in O(N) time and O(1) space.
 */
public class solution234 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find mid
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Compare left and right halves
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Is palindrome linked list? " + isPalindrome(head));
    }
}
