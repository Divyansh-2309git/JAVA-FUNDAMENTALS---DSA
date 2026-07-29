/**
 * Program Name : introduction
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Circular Queue Implementation, Fixed-size Array
 * -------------------------------------------------------------
 * Description  :
 * Custom Queue implementation using a fixed-size array from scratch.
 */
public class introduction {

    static class CustomArrayQueue {
        private int[] arr;
        private int size;
        private int rear;

        public CustomArrayQueue(int capacity) {
            arr = new int[capacity];
            size = capacity;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return arr[0];
        }
    }

    public static void main(String[] args) {
        CustomArrayQueue q = new CustomArrayQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
