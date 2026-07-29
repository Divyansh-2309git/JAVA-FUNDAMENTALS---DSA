/**
 * Program Name : functionsOverloading
 * Topic        : Basics
 * Difficulty   : Beginner
 * Concepts     : Method Overloading (Compile-time Polymorphism)
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates method overloading in Java by defining methods with the same name
 * but different parameter data types (int vs. float).
 */
public class functionsOverloading {
    
    // Sum for integer parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum for float parameters
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        float floatA = 10.4f;
        float floatB = 20.23f;
        int intA = 5;
        int intB = 23;

        // Compiler automatically selects the appropriate method signature
        System.out.println("Float sum: " + sum(floatA, floatB));
        System.out.println("Integer sum: " + sum(intA, intB));
    }
}
