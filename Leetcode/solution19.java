

public class solution19{

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = head ; 
        int size = 0 ; 
        while(temp != null ){
            temp = temp.next ; 
            size ++ ; 
        }
        if(size == n){
            return head.next;
        }       
        ListNode prev = head ;  
        for (int i = 0 ; i < size - n-1 ; i ++){
            prev = prev.next ; 
        }
        temp = prev.next ; 
        prev.next = prev.next.next ; 
        return head  ; 
    }
    public static void main(String[] args) {
        
    }
}