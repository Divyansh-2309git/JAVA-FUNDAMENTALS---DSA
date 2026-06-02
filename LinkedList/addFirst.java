import java.util.LinkedList;

public class addFirst{
    public class Node{
        int data ; 
        Node next ; 
        Node(int data ){
            this.data = data ; 
            this.next = null ; 
        }
    }
        public static Node head; 
        public static Node tail ; 
    

        public void addFirst(int data ){
            // Create a new node 
            Node newNode = new Node(data); 

            if(head == null){
                head = tail = newNode; 
                return ; 
            }
            // Link the past node to new node 
            newNode.next = head ; 

            // reassigning the new head 
            head = newNode ; 

        }
        public void printList(){
            Node temp = head ; 
            if (head == null){
                System.out.print("The linked list is empty"); 
            }
            while(temp != null ){
                System.out.print(temp.data + " ");
                temp = temp.next ; 
            }
            System.out.println();
        }
    
    public static void main(String args[]) {
        LinkedList ll = new LinkedList(); 
        ll.addFirst(1); 
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printList(); 
    }
}