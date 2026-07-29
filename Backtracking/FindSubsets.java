/**
 * Program Name : FindSubsets
 * Topic        : Backtracking
 * Difficulty   : Intermediate
 * Concepts     : Subset Generation, Binary Decision Tree, Backtracking
 * -------------------------------------------------------------
 * Description  :
 * Generates all 2^N subsets of a string by making a Yes/No choice for including each character.
 */
public class FindSubsets {

    public static void findSubsets(String str, int index, String currentSubset) {
        // Base case: processed all characters
        if (index == str.length()) {
            if (currentSubset.length() == 0) {
                System.out.println("Ø (Empty Set)");
            } else {
                System.out.println(currentSubset);
            }
            return;
        }

        // Choice 1: Include current character (YES)
        findSubsets(str, index + 1, currentSubset + str.charAt(index));

        // Choice 2: Exclude current character (NO)
        findSubsets(str, index + 1, currentSubset);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsets of \"" + str + "\":");
        findSubsets(str, 0, "");
    }
}
