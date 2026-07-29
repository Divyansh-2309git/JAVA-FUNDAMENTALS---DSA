# Object-Oriented Programming (OOPS) Overview

## What this topic teaches
Object-Oriented Programming (OOP) is the fundamental paradigm of Java. This module covers Classes, Objects, Access Modifiers, Encapsulation, Constructors (Default, Parameterized, Copy), Inheritance (Single, Multi-level, Hierarchical), Polymorphism (Overloading, Overriding), and Memory Management.

## Concepts Covered
- Classes, Objects, and Instance Variables
- Access Modifiers (, , , default package-private)
- Encapsulation & Data Hiding (Getters & Setters)
- Constructors (Default, Parameterized, Shallow Copy vs Deep Copy)
- Inheritance types (Single, Multi-level, Hierarchical)
- Polymorphism (Compile-time Method Overloading, Runtime Method Overriding)
- Destructors & Java Garbage Collection

## Programs Included

| Program | Description |
| :--- | :--- |
| [AccessModifiersDemo.java](AccessModifiersDemo.java) | Public vs Private member access and setter method usage. |
| [ClassesAndObjectsDemo.java](ClassesAndObjectsDemo.java) | Class instantiation and property/method invocation. |
| [ConstructorTypes.java](ConstructorTypes.java) | Non-parameterized vs Parameterized constructors. |
| [ConstructorsDemo.java](ConstructorsDemo.java) | Basic constructor invocation during object creation. |
| [CopyConstructorDeep.java](CopyConstructorDeep.java) | Deep copy constructor creating independent member array copies. |
| [CopyConstructorShallow.java](CopyConstructorShallow.java) | Shallow copy constructor copying object references. |
| [EncapsulationDemo.java](EncapsulationDemo.java) | Demonstrates data hiding by wrapping fields and methods. |
| [GarbageCollectionDestructors.java](GarbageCollectionDestructors.java) | Explains Java's Automatic Garbage Collection mechanism. |
| [GettersAndSetters.java](GettersAndSetters.java) | Accessing and modifying private class fields using getters and setters. |
| [HierarchicalInheritance.java](HierarchicalInheritance.java) | Multiple child classes inheriting from a single parent class. |
| [InheritanceTypes.java](InheritanceTypes.java) | Single-level and Multi-level class inheritance hierarchies. |
| [MethodOverloadingDemo.java](MethodOverloadingDemo.java) | Compile-time polymorphism using method overloading. |
| [MethodOverridingDemo.java](MethodOverridingDemo.java) | Runtime polymorphism using method overriding (). |

## Key Java Concepts
- **Shallow Copy vs Deep Copy**: Shallow copies duplicate references; Deep copies duplicate underlying object data.
- **Polymorphism**: Ability of an object to take on many forms.

## Common Interview Questions
1. What are the 4 main pillars of Object-Oriented Programming?
2. Explain the difference between method overloading and method overriding.
3. How does Java Garbage Collection work?

## Common Beginner Mistakes
- Forgetting to allocate memory for array instance variables inside deep copy constructors.
- Direct access to private variables outside the class without getters/setters.

## Real-world Uses
- Enterprise software architecture, domain modeling, library design, and GUI frameworks.

## Suggested Next Topic
Proceed to **Recursion Basics**.
