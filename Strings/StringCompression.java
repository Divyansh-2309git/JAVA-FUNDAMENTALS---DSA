/**
 * Program Name : StringCompression
 * Topic        : Strings
 * Difficulty   : Intermediate
 * Concepts     : String Compression, Run-Length Encoding, StringBuilder
 * -------------------------------------------------------------
 * Description  :
 * Performs run-length string compression (e.g. "aaabbbbccd" -> "a3b4c2d").
 */
public class StringCompression {

    /**
     * Compresses consecutive identical characters in a String.
     */
    public static String compress(String str) {
        StringBuilder compressedStr = new StringBuilder("");
        
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            
            // Count consecutive occurrences of current character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            compressedStr.append(str.charAt(i));
            if (count > 1) {
                compressedStr.append(count.toString());
            }
        }
        return compressedStr.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbbccd";
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compress(input));
    }
}
