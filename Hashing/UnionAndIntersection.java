/**
 * Program Name : UnionAndIntersection
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : HashSet, Set Operations (Union, Intersection)
 * -------------------------------------------------------------
 * Description  :
 * Calculates the size and elements of Union and Intersection of two integer arrays using HashSet in O(N + M) time.
 */
import java.util.HashSet;

public class UnionAndIntersection {

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        // Section 1: Calculate Union
        HashSet<Integer> unionSet = new HashSet<>();
        for (int val : arr1) {
            unionSet.add(val);
        }
        for (int val : arr2) {
            unionSet.add(val);
        }

        System.out.println("Union elements: " + unionSet);
        System.out.println("The size of the union set is " + unionSet.size());

        // Section 2: Calculate Intersection
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr1) {
            set.add(val);
        }

        int count = 0;
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int val : arr2) {
            if (set.contains(val)) {
                count++;
                intersectionSet.add(val);
                set.remove(val);
            }
        }

        System.out.println("Intersection elements: " + intersectionSet);
        System.out.println("The size of the intersection set is " + count);
    }
}