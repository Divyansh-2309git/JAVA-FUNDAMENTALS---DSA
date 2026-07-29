/**
 * Program Name : firstNonRepeating
 * Topic        : Queue
 * Difficulty   : Intermediate
 * Concepts     : Character Frequency Array, Queue Stream Processing
 * -------------------------------------------------------------
 * Description  :
 * Finds the first non-repeating character in a stream of characters using a Queue in O(N) time.
 */
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeating {

    public static void printNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        System.out.print("First non-repeating characters stream: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;

            // Remove repeating characters from front of queue
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }

            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String stream = "aabccxb";
        printNonRepeating(stream);
    }
}
