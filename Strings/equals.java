/**
 * Program Name : equals
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : String Pool, Memory Reference Comparison (==) vs. Value Equality (.equals)
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates the critical difference between using the '==' operator (reference check)
 * and the '.equals()' method (content check) in Java Strings.
 */
public class equals {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony"; // Points to same object in String Constant Pool
        String s3 = new String("tony"); // Creates new object in heap memory

        // Reference comparison (s1 vs s2) - true because both refer to String Pool
        if (s1 == s2) {
            System.out.println("s1 == s2: Same memory reference (String Pool optimization)");
        } else {
            System.out.println("s1 == s2: Different memory references");
        }

        // Reference comparison (s1 vs s3) - false because s3 is explicitly created in heap
        if (s1 == s3) {
            System.out.println("s1 == s3: Same memory reference");
        } else {
            System.out.println("s1 == s3: Different memory references");
        }

        // Content comparison using .equals() - true because character contents are identical
        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3): String values/contents are equal");
        } else {
            System.out.println("s1.equals(s3): String values/contents are not equal");
        }
    }
}
