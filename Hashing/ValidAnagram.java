/**
 * Program Name : ValidAnagram
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashMap Character Frequency Counting, Valid Anagram
 * -------------------------------------------------------------
 * Description  :
 * Checks whether two strings are valid anagrams (same characters with equal frequencies) using HashMap in O(N) time.
 */
import java.util.HashMap;

public class ValidAnagram {

    /**
     * Returns true if s and t are anagrams, false otherwise.
     * Time Complexity: O(N), Space Complexity: O(K) where K is number of unique characters
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrement frequency for characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + isAnagram(s, t));
    }
}