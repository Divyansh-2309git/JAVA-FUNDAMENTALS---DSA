/**
 * Program Name : CopyConstructorDeep
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Intermediate
 * Concepts     : Deep Copy Constructor, Array Memory Allocation
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates a Deep Copy Constructor where reference objects (arrays) are independently allocated
 * so changes to the copied object do not alter the original object.
 */
public class CopyConstructorDeep {
    public static void main(String[] args) {
        DeepStudent s1 = new DeepStudent();
        s1.name = "Divyansh";
        s1.age = 18;
        s1.marks = new int[3];
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 50;

        // Perform Deep Copy
        DeepStudent s2 = new DeepStudent(s1);
        s2.marks[2] = 95; // Modify s2 marks

        System.out.println("Original s1 Marks[2]: " + s1.marks[2]); // Remains 50 (unaffected)
        System.out.println("Deep Copied s2 Marks[2]: " + s2.marks[2]); // 95
    }
}

class DeepStudent {
    String name;
    int age;
    int[] marks;

    DeepStudent() {
        // Default constructor
    }

    // Deep Copy Constructor
    DeepStudent(DeepStudent s) {
        this.name = s.name;
        this.age = s.age;
        // Allocate new array memory for deep copy
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}
