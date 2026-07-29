/**
 * Program Name : DequeDemo
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Double-Ended Queue (Deque), Double Entry/Exit Operations
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates operations on a Double-Ended Queue (Deque) using java.util.Deque and LinkedList.
 */
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        // Add operations at both ends
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println("Deque: " + dq);

        // Remove operations
        dq.removeLast();
        System.out.println("After removing last element: " + dq);
    }
}
