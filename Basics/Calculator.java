/**
 * Program Name : Calculator
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Switch-Case Statement, User Input, Arithmetic Operators
 * -------------------------------------------------------------
 * Description  :
 * Implements a simple interactive calculator supporting addition, subtraction,
 * multiplication, and division using a switch-case control structure.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of A: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter the value of B: ");
        float num2 = scanner.nextFloat();
        
        System.out.print("Enter valid operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Please choose a valid operator (+, -, *, /).");
        }
        
        scanner.close();
    }
}
