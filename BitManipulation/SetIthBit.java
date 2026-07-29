/**
 * Program Name : SetIthBit
 * Topic        : Bit Manipulation
 * Difficulty   : Beginner
 * Concepts     : Bit Masking, Bitwise OR
 * -------------------------------------------------------------
 * Description  :
 * Sets the i-th bit (0-indexed from right) of a given number to 1.
 */
public class SetIthBit {

    /**
     * Sets the i-th bit of number 'n' to 1.
     */
    public static int setIthBit(int number, int position) {
        int bitMask = 1 << position;
        // Bitwise OR sets the target bit to 1 without altering other bits
        return number | bitMask;
    }

    public static void main(String[] args) {
        int number = 10; // Binary: 1010
        int position = 3; // Bit 3 is already 1; set position 0 or 3
        
        System.out.println("Number after setting bit " + position + ": " + setIthBit(number, position));
    }
}
