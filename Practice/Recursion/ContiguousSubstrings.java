/**
 * Program Name : ContiguousSubstrings
 * Topic        : Practice / Recursion
 * Difficulty   : Intermediate
 * Concepts     : Recursion, Substring Counting
 * -------------------------------------------------------------
 * Description  :
 * Practice problem to count contiguous substrings starting and ending with the same character.
 */
public class ContiguousSubstrings {

    public static int countSubstrings(String str, int i, int j, int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int res = countSubstrings(str, i + 1, j, n - 1)
                + countSubstrings(str, i, j - 1, n - 1)
                - countSubstrings(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println("Contiguous substrings count: " + countSubstrings(str, 0, n - 1, n));
    }
}
