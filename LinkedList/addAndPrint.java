public class addAndPrint {

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


    public void addFront(int data) {
        Node newNode = new Node(data);
        size++ ; 

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

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

    public void addIndex (int inx , int data ){
        Node newData = new Node(data ); 
        size++ ; 
        Node temp = head ; 
        int i = 0 ; 
        while ( i < inx - 1 ){
            temp = temp.next ; 
            i++ ; 
        }

        newData.next = temp.next ; 
        temp.next = newData ; 


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

    public int removeFirst(){
        if(size == 0 ){
            System.out.print("The linked list is empty");
            return -1 ; 
        }else if(size == 1){
            int val = head.data ; 
            head = tail = null ; 
            size = 0 ; 
            return val; 
        }
        int val = head.data ; 
        size -- ; 
        head = head.next ; 
        return val ; 
    }

    public int removeLast(){
        if (size == 0){
            System.out.println("The linked list is already empty"); 
            return -1 ; 
        }
        else if(size == 1 ){
            int val = head.data ; 
            head = tail = null ; 
            size = 0 ;
            return val ; 
        }
        Node prev = head ; 
        for (int i = 0 ; i < size - 2 ; i ++ ){
            prev = prev.next; 
        }
        int val = prev.next.data ; 

        prev.next = null ; 
        tail = prev ; 
        size -- ; 
        return val ; 
    }

    public static void main(String[] args) {

        addAndPrint ll = new addAndPrint();

        ll.addFront(1);
        ll.addFront(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printList();

        ll.addIndex(2, 12);
        ll.printList();
        System.out.println(ll.size); 
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast()); 
        ll.printList();
    }
}