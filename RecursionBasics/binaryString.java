/**
 * Program Name : binaryString
 * Topic        : RecursionBasics
 * Difficulty   : Intermediate
 * Concepts     : Backtracking, Binary Sequences without Consecutive 1s
 * -------------------------------------------------------------
 * Description  :
 * Generates all binary strings of length N with no consecutive 1s using recursion.
 */
public class binaryString {

    public static void generateBinaryStrings(int n, int lastPlace, String str) {
        // Base case: length reached
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always valid to append '0'
        generateBinaryStrings(n - 1, 0, str + "0");

        // Can append '1' only if last placed character was '0'
        if (lastPlace == 0) {
            generateBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Binary strings of length " + n + " with no consecutive 1s:");
        generateBinaryStrings(n, 0, "");
    }
}
