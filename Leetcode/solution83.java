public class solution83{
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
    public void deleteDuplicates(ListNode head ){
        ListNode curr = head ; 
        while(curr != null && curr.next != null ){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next ; 
            }else{
                curr = curr.next ; 
            }
        }
    }
    
    public static void main(String[] args) {
    
    }
}