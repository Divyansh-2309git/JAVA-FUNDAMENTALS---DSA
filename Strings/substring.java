/**
 * Program Name : substring
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : Substring Extraction, Index Ranges
 * -------------------------------------------------------------
 * Description  :
 * Custom implementation of substring extraction from start index (inclusive) to end index (exclusive).
 */
public class substring {

    /**
     * Extracts substring from startIndex to endIndex - 1.
     */
    public static String getCustomSubstring(String str, int startIndex, int endIndex) {
        StringBuilder substr = new StringBuilder("");
        for (int i = startIndex; i < endIndex; i++) {
            substr.append(str.charAt(i));
        }
        return substr.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        // Extract substring from index 0 to 5
        System.out.println("Custom Substring (0, 5): " + getCustomSubstring(str, 0, 5));
        System.out.println("Built-in Substring (0, 5): " + str.substring(0, 5));
    }
}
