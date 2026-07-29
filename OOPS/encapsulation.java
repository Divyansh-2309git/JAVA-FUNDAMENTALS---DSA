/**
 * Program Name : encapsulation
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Encapsulation, Data Bundling, Access Control
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Encapsulation — wrapping data attributes and methods together into a single class unit.
 */
public class encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee("Divyansh", 75000);
        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}

class Employee {
    // Encapsulated private data fields
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
