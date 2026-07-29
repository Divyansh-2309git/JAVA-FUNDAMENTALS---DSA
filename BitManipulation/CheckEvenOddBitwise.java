/**
 * Program Name : CheckEvenOddBitwise
 * Topic        : Bit Manipulation
 * Difficulty   : Beginner
 * Concepts     : Bitwise AND, Least Significant Bit (LSB)
 * -------------------------------------------------------------
 * Description  :
 * Checks whether a number is even or odd by inspecting its Least Significant Bit (LSB).
 */
public class CheckEvenOddBitwise {

    /**
     * Determines parity using bitwise AND with 1.
     * Note: Odd numbers always end with LSB = 1 in binary; even numbers end with LSB = 0.
     */
    public static void checkEvenOrOdd(int number) {
        int bitMask = 1;
        if ((number & bitMask) == 1) {
            System.out.println(number + " is Odd.");
        } else {
            System.out.println(number + " is Even.");
        }
    }

    public static void main(String[] args) {
        int number = 5;
        checkEvenOrOdd(number);
    }
}
