import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of B: ");
        float b = sc.nextFloat();
        System.out.println("Enter a Valid operation you want to perform");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Please choose a valid operation to perform.");

        }
    }

}
