/**
 * Program Name : StackLinkedListImplementation
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : Singly Linked List Stack, Head Pointer Modification
 * -------------------------------------------------------------
 * Description  :
 * Implements a Stack data structure from scratch using a Singly Linked List (push/pop at head).
 */
public class StackLinkedListImplementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedStack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
