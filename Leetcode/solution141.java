public class solution141{
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
    public boolean isCyclic(ListNode head ){
        ListNode slow = head; 
        ListNode fast = head; 
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true ; 
            }
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        return false ; 
    }
    public static void main(String[] args) {
        
    }
}