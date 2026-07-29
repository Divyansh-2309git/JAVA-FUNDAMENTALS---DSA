/**
 * Program Name : ReverseNumber
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Digit Extraction, Arithmetic Operations, Loops
 * -------------------------------------------------------------
 * Description  :
 * Reverses the digits of an integer number mathematically.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 101;
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
