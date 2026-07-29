/**
 * Program Name : binaryOperators
 * Topic        : Bit Manipulation
 * Difficulty   : Beginner
 * Concepts     : Bitwise AND, OR, XOR, NOT, Left Shift, Right Shift
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates basic Java bitwise operators operating on integer bits.
 */
public class binaryOperators {
    public static void main(String[] args) {
        // Bitwise AND (&): 1 if both bits are 1
        System.out.println("5 & 6 = " + (5 & 6));  // 101 & 110 = 100 (4)

        // Bitwise OR (|): 1 if at least one bit is 1
        System.out.println("5 | 6 = " + (5 | 6));  // 101 | 110 = 111 (7)

        // Bitwise XOR (^): 1 if bits are different
        System.out.println("5 ^ 6 = " + (5 ^ 6));  // 101 ^ 110 = 011 (3)

        // Bitwise NOT (~): Inverts all bits (2's complement representation)
        System.out.println("~5 = " + (~5));        // ~0000...0101 = 1111...1010 (-6)
        System.out.println("~(~5) = " + (~(~5)));  // Double inversion returns original number (5)

        // Left Shift (<<): a << b shifts 'a' left by 'b' bits (equivalent to a * 2^b)
        System.out.println("6 << 1 = " + (6 << 1)); // 6 * 2^1 = 12

        // Right Shift (>>): a >> b shifts 'a' right by 'b' bits (equivalent to a / 2^b)
        System.out.println("6 >> 2 = " + (6 >> 2)); // 6 / 2^2 = 1
    }
}
