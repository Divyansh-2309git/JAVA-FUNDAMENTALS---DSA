

public class solution234 {
    class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    public static ListNode chand ; 

    

    public static boolean isPalindrome(ListNode head ){
        ListNode mid = midPoint(head); 
        ListNode prev = null ; 
        ListNode next ; 
        ListNode temp = mid ; 
        while(temp != mid ){
            next = temp.next ; 
            temp.next = prev ; 
            prev  = temp ; 
            temp = next ; 
        }
        ListNode newHead = prev ; 
        ListNode curr = head ; 
        while(newHead != null ){
            if(newHead.val != curr.val){
                return false ; 
            }
        }
        return true ; 

    }


    public static ListNode  midPoint (ListNode head ){
        ListNode slow = head ; 
        ListNode fast = head ; 
        while(fast != null && fast.next != null ){
            fast = fast.next.next ; 
            slow = slow.next ; 

        }
        return slow ; 
    }
    

}