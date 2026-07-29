/**
 * Program Name : toUpperCase
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : Character Case Conversion, StringBuilder, Title Case Logic
 * -------------------------------------------------------------
 * Description  :
 * Converts the first letter of each word in a string to uppercase (Title Case).
 */
public class toUpperCase {

    /**
     * Capitalizes the first letter of each word in a given sentence.
     */
    public static String convertToTitleCase(String str) {
        if (str == null || str.length() == 0) return str;

        StringBuilder sb = new StringBuilder("");
        // Capitalize first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String inputSentence = "hi my name is divyansh";
        System.out.println("Original: " + inputSentence);
        System.out.println("Title Case: " + convertToTitleCase(inputSentence));
    }
}
