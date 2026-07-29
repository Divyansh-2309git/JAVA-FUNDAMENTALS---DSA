/**
 * Program Name : patterns
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Nested Loops, Character Arithmetic, Pattern Printing
 * -------------------------------------------------------------
 * Description  :
 * Prints a continuous character triangle pattern based on user input.
 * Example for N = 3:
 * A
 * BC
 * DEF
 */
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = scanner.nextInt();
        
        char character = 'A';
        for (int line = 1; line <= lines; line++) {
            for (int ch = 1; ch <= line; ch++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
