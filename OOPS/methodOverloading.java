/**
 * Program Name : methodOverloading
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Compile-Time Polymorphism, Method Overloading
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates method overloading by defining multiple 'sum' methods with different parameter lists.
 */
public class methodOverloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.sum(1, 2));
        System.out.println("Sum (float, float): " + calc.sum(1.5f, 2.3f));
        System.out.println("Sum (int, int, int): " + calc.sum(2, 3, 4));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
