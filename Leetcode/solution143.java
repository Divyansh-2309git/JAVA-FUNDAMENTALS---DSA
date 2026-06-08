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
    public void reverse(){
        Node prev = null ;
        Node curry= midNode() ; 
        Node curr = curry.next ; 
        Node Next ; 
        while (curr != null ){
            Next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = Next ; 

        }
        Node first = head;
        Node second = prev;

        while (second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        
        
    }
    
    public static void main(String args[]){
        solution143 ll = new solution143() ; 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        ll.reverse();
        ll.printList();
        
        // ll.midNode();
        
    }

}
