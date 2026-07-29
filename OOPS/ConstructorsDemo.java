/**
 * Program Name : ConstructorsDemo
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Parameterized Constructor, Object Initialization
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates how parameterized constructors initialize instance variables when an object is instantiated.
 */
public class ConstructorsDemo {
    public static void main(String[] args) {
        BasicStudent s1 = new BasicStudent("Divyansh");
        System.out.println("Student Name: " + s1.name);
    }
}

class BasicStudent {
    String name;

    BasicStudent(String name) {
        this.name = name;
        System.out.println("Parameterized constructor invoked for: " + name);
    }
}
