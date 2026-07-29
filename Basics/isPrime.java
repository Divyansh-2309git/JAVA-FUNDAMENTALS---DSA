/**
 * Program Name : isPrime
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Loop Optimization, Square Root Method, Primality Testing
 * -------------------------------------------------------------
 * Description  :
 * Checks if a given user-input number is prime by checking divisors up to Math.sqrt(N).
 */
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            // Optimization: A non-prime number N must have a factor <= sqrt(N)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println("Is " + number + " prime? " + isPrime);
        scanner.close();
    }
}
