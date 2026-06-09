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

    public int itrSearrch(int key ){
        Node temp = head ; 
        int i = 0 ;
        while(temp != null ){
            if(temp.data == key){
                return i ; 
            }
            temp = temp.next ; 
            i ++ ; 
        }
        return -1 ; 
    }
    public int helper(Node head , int key){
        if(head == null){
            return -1 ; 
        }
        if(head.data == key ){
            return 0 ; 
        }
        int indx = helper(head.next , key); 

        if(indx == -1){
            return -1; 
        }
        return indx + 1 ; 
    }
    public int recSearch(int key){
        return helper(head, key); 
    }

    public void reverse(){
        Node prev = null ; 
        Node curr = tail =  head ; 
        Node next ; 

        while(curr != null ){
            next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = next ;   
        }

        head = prev ; 

    }

    public void deleteFromBack(int index){
        int len = 0 ; 
        Node temp = head ; 
        while(temp != null ){
            len ++ ; 
            temp = temp.next ; 
        } 

        if(index == len  ){
            head = head.next ; 
            return ; 
        }

        int i = 1 ; 
        int toFind = len - index ; 
        Node prev = head ; 
        while(i < toFind){
            prev = prev.next ; 
            i ++ ; 
        }

        prev.next = prev.next.next; 
        return ; 
        

    }
    public Node findMid(Node head ){
        Node slow = head ; 
        Node fast = head ; 
        while(fast != null && fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        return slow ; //Slow is the middle node 
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true ; 
        }

        Node midNode = findMid(head); //Find mid node 

        Node prev = null ; 
        Node curr = midNode ; 
        Node Next ; 
        while(curr != null){
            Next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = Next ; 
        }

        Node right = prev ; 
        Node left = head; 
        

        while(right != null ){
            if(left.data != right.data){
                return false ; 
            }  
            left = left.next ;
            right = right.next ; 
        }
        return true ;        
    }
    public boolean  isCyclic (){
        Node slow = head ; 
        Node fast = head ; 
        while (fast != null && fast.next != null ){
            slow = slow.next ; 
            fast = fast.next.next ; 
            if(slow == fast ){
                return true ; 
            }
        }
        return false; 
    }

    public void removeCycle(){
        // Detect cycle 
        Node slow = head ; 
        Node fast = head ; 
        boolean cycle = false ; 

        while(fast != null && fast.next != null ){ 
            slow = slow.next ; 
            fast = fast.next.next ; 
            if(slow == fast ){
                cycle = true ; 
                break ; 
            }
        }
        if(cycle == false ){
            return ; 
        }
        // Find the meeting point 

        // ! for corner case where slow is already equals to fast 

        slow = head ; 
        Node prev = null ; 

        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while(slow != fast ){
            slow = slow.next ; 
            fast = fast.next ; 
            prev = fast ; 
        }
        // Making the previous.next to null 
        prev.next = null ; 
    }
    public void duplicateRemove(){
        Node prev = null ; 
        Node curr = head ; 
        while(curr != null && curr.next != null ){
            if(prev == null ){
                prev = curr; 
                curr = curr.next ; 

            }else{
                if (curr.data != prev.data ){
                    prev = curr ; 
                    curr = curr.next ; 
                }else{
                    if(curr.next.next != null){

                    curr.next = prev.next.next;
                    }else {
                        curr.next = null ; 
                    }
                }
            }    
        }
    }

    public static void main(String[] args) {

        addAndPrint ll = new addAndPrint();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(1);
        

        System.out.println(ll.checkPalindrome());
    }
}