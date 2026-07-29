/**
 * Program Name : WhileLoops
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : While Loops, Accumulation, User Input
 * -------------------------------------------------------------
 * Description  :
 * Calculates the sum of the first N natural numbers using a while loop.
 */
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int number = scanner.nextInt();
        
        int counter = 1;
        int sum = 0;
        
        // Loop runs from 1 to N, accumulating the sum
        while (counter <= number) {
            sum += counter;
            counter++;
        }
        
        System.out.println("Sum of first " + number + " natural numbers is: " + sum);
        scanner.close();
    }
}
