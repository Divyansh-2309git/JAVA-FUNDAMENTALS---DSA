/**
 * Program Name : StackUsingDeque
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Deque Adaptation, Stack Interface Simulation
 * -------------------------------------------------------------
 * Description  :
 * Implements a Stack using java.util.Deque container.
 */
import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    static class DequeStack {
        private Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        DequeStack stack = new DequeStack();
        stack.push(100);
        stack.push(200);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
