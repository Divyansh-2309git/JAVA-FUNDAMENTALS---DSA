/**
 * Program Name : PriorityQueueCustomObjects
 * Topic        : Heaps
 * Difficulty   : Intermediate
 * Concepts     : PriorityQueue with Objects, Comparable Interface, Custom Sorting
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates how to use Java's PriorityQueue with custom objects implementing Comparable.
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomObjects {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Ascending order by rank
        }
    }

    public static void main(String[] args) {
        // Reverse order comparator sorts highest rank first
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 10));
        pq.add(new Student("B", 25));
        pq.add(new Student("C", 12));
        pq.add(new Student("D", 2));

        System.out.println("Students prioritized in reverse rank order:");
        while (!pq.isEmpty()) {
            Student s = pq.remove(); //O(log N)
            System.out.println("Student: " + s.name + ", Rank: " + s.rank);
        }
    }
}
