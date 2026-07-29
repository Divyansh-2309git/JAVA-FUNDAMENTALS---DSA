/**
 * Program Name : usingJCF
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Java Collections Framework, Queue Interface, LinkedList Implementation
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates standard Queue operations using java.util.Queue interface backed by LinkedList.
 */
import java.util.LinkedList;
import java.util.Queue;

public class usingJCF {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
