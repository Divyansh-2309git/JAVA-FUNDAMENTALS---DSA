/**
 * Program Name : ConstructorTypes
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Default vs. Parameterized Constructors, Constructor Overloading
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates non-parameterized (default) and parameterized constructors in Java.
 */
public class ConstructorTypes {
    public static void main(String[] args) {
        TypesStudent s1 = new TypesStudent(); // Invokes default constructor
        TypesStudent s2 = new TypesStudent("Divyansh"); // Invokes parameterized constructor
    }
}

class TypesStudent {
    String name;
    int age;

    // Non-parameterized constructor
    TypesStudent() {
        System.out.println("Default non-parameterized constructor invoked.");
    }

    // Parameterized constructor
    TypesStudent(String name) {
        this.name = name;
        System.out.println("Parameterized constructor invoked with name: " + name);
    }
}
