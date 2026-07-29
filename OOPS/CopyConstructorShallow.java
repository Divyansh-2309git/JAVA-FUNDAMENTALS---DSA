/**
 * Program Name : CopyConstructorShallow
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Intermediate
 * Concepts     : Shallow Copy Constructor, Reference Copying
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates a Copy Constructor creating a shallow copy of an existing object.
 */
public class CopyConstructorShallow {
    public static void main(String[] args) {
        CopyStudent s1 = new CopyStudent();
        s1.name = "Divyansh";
        s1.roll = 101;
        s1.password = "SecretPass";

        // Copy constructor creates s2 as a duplicate of s1
        CopyStudent s2 = new CopyStudent(s1);
        System.out.println("Copied Student Name: " + s2.name + ", Roll: " + s2.roll);
    }
}

class CopyStudent {
    String name;
    int roll;
    String password;

    CopyStudent() {
        System.out.println("Default constructor called.");
    }

    // Copy Constructor (Shallow Copy)
    CopyStudent(CopyStudent s) {
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;
    }
}
