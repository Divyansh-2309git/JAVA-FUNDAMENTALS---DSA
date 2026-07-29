/**
 * Program Name : methodOverriding
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Run-Time Polymorphism, Dynamic Method Dispatch, Overriding
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates method overriding where a subclass (Deer) provides a specific implementation
 * of a method ('eats') already defined in its parent class (WildAnimal).
 */
public class methodOverriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eats(); // Calls Deer's overridden method
    }
}

class WildAnimal {
    void eats() {
        System.out.println("The animal eats generic food.");
    }
}

class Deer extends WildAnimal {
    @Override
    void eats() {
        System.out.println("The deer eats green grass.");
    }
}
