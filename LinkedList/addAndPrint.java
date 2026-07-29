/**
 * Program Name : addAndPrint
 * Topic        : LinkedList
 * Difficulty   : Intermediate
 * Concepts     : Singly Linked List, Pointer Manipulation, Floyd's Cycle Detection, Palindrome Check
 * -------------------------------------------------------------
 * Description  :
 * Comprehensive Singly Linked List implementation featuring insertion, deletion, searching,
 * list reversal, middle node finding, palindrome verification, cycle detection, and cycle removal.
 */
public class addAndPrint {

    // Node class representing individual linked list elements
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size = 0;

    /**
     * Inserts a new node at the head (front) of the Linked List. O(1) time.
     */
    public void addFront(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    /**
     * Appends a new node at the tail (end) of the Linked List. O(1) time.
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Inserts a node at a specific 0-based index. O(N) time.
     */
    public void addIndex(int index, int data) {
        if (index == 0) {
            addFront(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    /**
     * Prints all nodes in the Linked List.
     */
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Removes the head node. O(1) time.
     */
    public int removeFirst() {
        if (size == 0 || head == null) {
            System.out.println("Linked List is empty.");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    /**
     * Removes the tail node. O(N) time.
     */
    public int removeLast() {
        if (size == 0 || head == null) {
            System.out.println("Linked List is empty.");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    /**
     * Iteratively searches for a key in the Linked List.
     */
    public int itrSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    private int recursiveHelper(Node node, int key) {
        if (node == null) return -1;
        if (node.data == key) return 0;

        int subIndex = recursiveHelper(node.next, key);
        if (subIndex == -1) return -1;
        return subIndex + 1;
    }

    /**
     * Recursively searches for a key in the Linked List.
     */
    public int recSearch(int key) {
        return recursiveHelper(head, key);
    }

    /**
     * Reverses the Linked List in-place. O(N) time, O(1) space.
     */
    public void reverse() {
        Node prev = null;
        Node curr = head;
        tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /**
     * Deletes the N-th node from the end of the Linked List.
     */
    public void deleteFromBack(int n) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n == length) {
            head = head.next; // Remove head node
            return;
        }

        int targetIndex = length - n;
        Node prev = head;
        for (int i = 1; i < targetIndex; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    /**
     * Finds the middle node using Slow & Fast Pointers (Turtle & Hare algorithm).
     */
    public Node findMid(Node headNode) {
        Node slow = headNode;
        Node fast = headNode;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Moves 1 step
            fast = fast.next.next;  // Moves 2 steps
        }
        return slow; // Middle node
    }

    /**
     * Checks if the Linked List is a palindrome.
     */
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find Mid Node
        Node mid = findMid(head);

        // Step 2: Reverse Second Half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare left half and right half
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    /**
     * Detects cycle using Floyd's Cycle-Finding Algorithm.
     */
    public boolean isCyclic() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false;
    }

    /**
     * Detects and breaks a cycle in the Linked List.
     */
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        if (!cycleExists) return;

        // Reset slow to head to find loop start point
        slow = head;
        Node prev = null;

        // Corner case: Cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null; // Break loop connection
    }

    public static void main(String[] args) {
        addAndPrint list = new addAndPrint();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        System.out.print("Linked List: ");
        list.printList();
        System.out.println("Is Palindrome? " + list.checkPalindrome());
    }
}
