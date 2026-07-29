/**
 * Program Name : AccessModifiersDemo
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Access Modifiers (public, private), Data Hiding, Getters/Setters
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates access restriction in Java. Public properties can be directly accessed,
 * whereas private properties are hidden and updated via setter methods.
 */
public class AccessModifiersDemo {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.username = "Divyansh"; // Public field accessible directly
        bk.setPassword("SecurePassword123"); // Private field modified via setter
    }
}

class BankAccount {
    public String username;    // Accessible anywhere
    private String password;   // Restricted to BankAccount class only

    public void setPassword(String pwd) {
        this.password = pwd;
        System.out.println("Password updated successfully.");
    }
}
