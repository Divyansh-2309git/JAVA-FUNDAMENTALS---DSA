/**
 * Program Name : BinaryDecimalConversion
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Number Base Conversion, Math Functions, While Loops
 * -------------------------------------------------------------
 * Description  :
 * Provides utility methods to convert binary numbers to decimal
 * and decimal numbers to binary.
 */
import java.util.Scanner;

public class BinaryDecimalConversion {

    /**
     * Converts a binary number (e.g., 1010) to its decimal equivalent (10).
     */
    public static int toDec(int binaryNum) {
        int decimalSum = 0;
        int power = 0;
        
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalSum += lastDigit * Math.pow(2, power);
            binaryNum /= 10;
            power++;
        }
        return decimalSum;
    }

    /**
     * Converts a decimal number (e.g., 10) to its binary representation (1010).
     */
    public static int toBin(int decimalNum) {
        int binaryNum = 0;
        int power = 0;
        
        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            binaryNum += remainder * Math.pow(10, power);
            decimalNum /= 2;
            power++;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert to binary: ");
        int num = scanner.nextInt();
        
        System.out.println("Binary representation: " + toBin(num));
        scanner.close();
    }
}
