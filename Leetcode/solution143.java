public class solution143{
    
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size ; 

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++ ; 
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public Node midNode(){
        Node slow = head ; 
        Node fast = head ; 
        while(fast != null && fast.next != null ){
            slow = slow.next ; 
            fast = fast.next.next ; 

        }
        return slow ; 
    }
    public void reverseAfterMidPoint(Node midpoint){
        Node prev = null ; 
        Node curr = midpoint ; 
        Node next ; 
        while(curr != null ){
            next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = next ;  
        }
    }

    public void reorderList(){
        Node midpoint = midNode(); 
        reverseAfterMidPoint(midpoint); 


    }
    public static void main(String args[]){
        solution143 ll = new solution143() ; 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();
        ll.reorderList();
        ll.printList();
    }

}
