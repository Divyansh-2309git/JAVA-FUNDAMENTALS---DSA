/**
 * Program Name : hierarchicalInheritance
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Hierarchical Inheritance, Superclass vs. Subclasses
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Hierarchical Inheritance, where multiple child classes (Fish, Mammal, Birds)
 * inherit from a single parent class (Animal).
 */
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Birds falcon = new Birds();
        falcon.breathes();
        falcon.flies();

        HierarchicalMammal elephant = new HierarchicalMammal();
        elephant.breathes();
        elephant.walks();

        HierarchicalFish salmon = new HierarchicalFish();
        salmon.breathes();
        salmon.swims();
    }
}

class HierarchicalAnimal {
    void breathes() {
        System.out.println("This animal breathes oxygen.");
    }
}

class HierarchicalFish extends HierarchicalAnimal {
    void swims() {
        System.out.println("Fish swims in water.");
    }
}

class HierarchicalMammal extends HierarchicalAnimal {
    void walks() {
        System.out.println("Mammal walks on land.");
    }
}

class Birds extends HierarchicalAnimal {
    void flies() {
        System.out.println("Bird flies in the sky.");
    }
}
