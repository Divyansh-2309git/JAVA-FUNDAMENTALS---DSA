/**
 * Program Name : stackUsingTwoQueues
 * Topic        : Queue
 * Difficulty   : Intermediate
 * Concepts     : Two Queues Adaptation, LIFO Simulation via Queues
 * -------------------------------------------------------------
 * Description  :
 * Implements LIFO Stack operations using two Queues.
 */
import java.util.LinkedList;
import java.util.Queue;

public class stackUsingTwoQueues {

    static class TwoQueueStack {
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public int pop() {
            if (isEmpty()) return -1;
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) break;
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) break;
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek() {
            if (isEmpty()) return -1;
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        TwoQueueStack s = new TwoQueueStack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
