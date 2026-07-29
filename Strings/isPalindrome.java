/**
 * Program Name : isPalindrome
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : Two-pointer String Traversal, Palindrome Check
 * -------------------------------------------------------------
 * Description  :
 * Checks whether a given string is a palindrome (reads same forward and backward).
 */
public class isPalindrome {

    /**
     * Returns true if str is a palindrome, false otherwise.
     * Time Complexity: O(N/2) = O(N), Space Complexity: O(1)
     */
    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // Character mismatch found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr = "racecar";
        System.out.println("Is \"" + testStr + "\" a palindrome? " + checkPalindrome(testStr));
    }
}
