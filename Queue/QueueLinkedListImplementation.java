/**
 * Program Name : QueueLinkedListImplementation
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Linked List Queue, Head & Tail References
 * -------------------------------------------------------------
 * Description  :
 * Custom Queue implementation from scratch backed by a Singly Linked List with head and tail pointers.
 */
public class QueueLinkedListImplementation {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CustomLinkedListQueue {
        private Node head = null;
        private Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int frontVal = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return frontVal;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        CustomLinkedListQueue q = new CustomLinkedListQueue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
