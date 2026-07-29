/**
 * Program Name : RemoveDuplicatesString
 * Topic        : RecursionBasics
 * Difficulty   : Intermediate
 * Concepts     : Boolean Mapping, String Processing, Recursion
 * -------------------------------------------------------------
 * Description  :
 * Removes duplicate lowercase characters from a string using a boolean frequency map recursively.
 */
public class RemoveDuplicatesString {

    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        if (index == str.length()) {
            System.out.println("String without duplicates: " + newStr);
            return;
        }

        char currentChar = str.charAt(index);
        int mapIndex = currentChar - 'a';

        if (map[mapIndex]) {
            // Character already seen, skip
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            // New character, mark seen and append
            map[mapIndex] = true;
            removeDuplicates(str, index + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
