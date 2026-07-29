/**
 * Program Name : CircleAreaCalculation
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Variables, Data Types, Circle Area Calculation
 * -------------------------------------------------------------
 * Description  :
 * Calculates the area of a circle given the radius input by the user.
 */
import java.util.Scanner;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();
        
        float area = 3.14159f * radius * radius;
        System.out.println("Area of circle: " + area);
        scanner.close();
    }
}
