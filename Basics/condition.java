/**
 * Program Name : condition
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Conditional Logic (if-else-if), Type Casting
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates income tax calculation based on specified income slabs.
 */
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        int income = scanner.nextInt();
        int tax;

        // Income tax brackets
        if (income < 50000) {
            tax = 0;
        } else if (income >= 50000 && income < 100000) {
            tax = (int) (income * 0.2); // 20% tax
        } else {
            tax = (int) (income * 0.3); // 30% tax
        }

        System.out.println("Tax amount: " + tax);
        System.out.println("Income after tax: " + (income - tax));
        scanner.close();
    }
}
