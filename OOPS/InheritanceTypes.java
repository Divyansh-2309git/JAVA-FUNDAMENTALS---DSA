/**
 * Program Name : InheritanceTypes
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Single & Multilevel Inheritance, Reusability ('extends')
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Single-level and Multilevel inheritance hierarchies in Java.
 */
public class InheritanceTypes {
    public static void main(String[] args) {
        // Single level inheritance example
        SingleFish shark = new SingleFish();
        shark.eat();
        shark.swim();

        // Multilevel inheritance example
        Dog doggy = new Dog();
        doggy.eat(); // Inherited from Animal
        doggy.legs = 4; // Inherited from Mammal
        doggy.bark();
    }
}

class AnimalBase {
    String color;

    void eat() {
        System.out.println("Animal eats food.");
    }

    void breathe() {
        System.out.println("Animal breathes.");
    }
}

// Single Level Inheritance
class SingleFish extends AnimalBase {
    int fins;

    void swim() {
        System.out.println("Swims in water.");
    }
}

// Multilevel Inheritance Step 1
class MammalBase extends AnimalBase {
    int legs;
}

// Multilevel Inheritance Step 2
class Dog extends MammalBase {
    void bark() {
        System.out.println("Dog barks.");
    }
}
