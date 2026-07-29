/**
 * Program Name : largestString
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : Lexicographical Comparison, compareTo() Method
 * -------------------------------------------------------------
 * Description  :
 * Finds the lexicographically largest string (alphabetically last) in an array of strings.
 */
public class largestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        String largest = fruits[0];

        // Lexicographical comparison using compareTo()
        // returns < 0 if largest comes before fruits[i] alphabetically
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Lexicographically largest string: " + largest);
    }
}
