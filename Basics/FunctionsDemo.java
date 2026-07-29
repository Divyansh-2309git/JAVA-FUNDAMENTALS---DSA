/**
 * Program Name : FunctionsDemo
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Methods, Parameters, Pass-by-Value, Binomial Coefficient
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates fundamental Java methods including arithmetic operations,
 * swap logic, factorial calculation, and binomial coefficient nCr.
 */
import java.util.Scanner;

public class FunctionsDemo {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // Demonstrates pass-by-value in Java (original variables outside method remain unchanged)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap -> a: " + a + ", b: " + b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Calculates Binomial Coefficient: nCr = n! / (r! * (n-r)!)
     */
    public static int coefficient(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n - r);

        return factN / (factR * factNminusR);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n and r for nCr calculation: ");
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        
        System.out.println("Binomial Coefficient (" + n + "C" + r + "): " + coefficient(n, r));
        scanner.close();
    }
}
