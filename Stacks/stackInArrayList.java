/**
 * Program Name : stackInArrayList
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : Custom Stack Implementation, Dynamic Array List Backing
 * -------------------------------------------------------------
 * Description  :
 * Implements a Stack data structure from scratch using an ArrayList as the underlying container.
 */
import java.util.ArrayList;

public class stackInArrayList {

    static class CustomStack {
        private ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
