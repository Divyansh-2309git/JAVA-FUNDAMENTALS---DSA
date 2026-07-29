/**
 * Program Name : forLoops
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Loops, Break Statement, User Input Processing
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates loop execution and early exit using the 'break' keyword
 * when a specific condition (number is a multiple of 10) is met.
 */
import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Keep entering numbers (program stops when you enter a multiple of 10):");
        while (true) {
            int number = scanner.nextInt();
            // Early break condition
            if (number % 10 == 0) {
                System.out.println("Multiple of 10 detected! Exiting loop.");
                break;
            }
        }
        scanner.close();
    }
}
