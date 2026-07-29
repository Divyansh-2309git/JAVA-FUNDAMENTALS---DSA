/**
 * Program Name : stringBuilder
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : StringBuilder, String Mutability, Performance Optimization
 * -------------------------------------------------------------
 * Description  :
 * Uses StringBuilder to efficiently append characters (alphabet a-z) in O(26) time.
 */
public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder provides mutable character sequences for efficient string modifications
        StringBuilder sb = new StringBuilder("");
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println("Alphabet concatenated using StringBuilder: " + sb.toString());
    }
}
