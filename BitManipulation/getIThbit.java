/**
 * Program Name : getIThbit
 * Topic        : Bit Manipulation
 * Difficulty   : Beginner
 * Concepts     : Bit Masking, Left Shift, Bitwise AND
 * -------------------------------------------------------------
 * Description  :
 * Retrieves the value (0 or 1) of the i-th bit (0-indexed from right) of a number.
 */
public class getIThbit {

    /**
     * Returns the bit at index i (0-based from LSB).
     */
    public static int getIthBit(int number, int position) {
        int bitMask = 1 << position; // Shift 1 to position 'position'
        
        // Bitwise AND isolates the i-th bit
        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 10; // Binary: 1010
        int position = 2; // Check 2nd bit (0-indexed, should be 0)
        
        System.out.println("Bit at position " + position + " of " + number + " is: " + getIthBit(number, position));
    }
}
