/**
 * Program Name : PrimeFunctionDemo
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Functions, Prime Optimization, Loop Ranges
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates functional modularity by checking if numbers are prime
 * and printing all prime numbers within a given range [2, N].
 */
import java.util.Scanner;

public class PrimeFunctionDemo {

    /**
     * Checks if a given number is prime using the sqrt(N) optimization.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints all prime numbers from 2 up to N.
     */
    public static void primesInRange(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upper limit to find prime numbers: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        primesInRange(limit);
        scanner.close();
    }
}
