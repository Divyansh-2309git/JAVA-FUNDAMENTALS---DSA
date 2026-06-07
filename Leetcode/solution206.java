

public class solution206{
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public ListNode head ; 

        public void reverseList(ListNode head ){
            ListNode prev = null ; 
            ListNode temp = head ; 
            ListNode Next ;
            while(temp != null ){
                Next = temp.next ; 
                temp.next = prev ; 
                prev = temp ; 
                temp = Next ; 

            }
            head = prev ; 
        }
    }
    public static void main(String[] args) {
        
    }
}