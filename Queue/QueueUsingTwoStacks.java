/**
 * Program Name : QueueUsingTwoStacks
 * Topic        : Queue
 * Difficulty   : Intermediate
 * Concepts     : Two Stacks Adaptation, Push-heavy FIFO Simulation
 * -------------------------------------------------------------
 * Description  :
 * Implements FIFO Queue operations using two Stacks.
 */
import java.util.Stack;

public class QueueUsingTwoStacks {

    static class TwoStackQueue {
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) return -1;
            return s1.pop();
        }

        public int peek() {
            if (isEmpty()) return -1;
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        TwoStackQueue q = new TwoStackQueue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
