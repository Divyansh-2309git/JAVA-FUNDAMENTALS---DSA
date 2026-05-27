import java.util.*;

public class functions {
    public static void printHello() {
        System.out.println("Hello , World! ");
        System.out.println("Hello , World! ");
        System.out.println("Hello , World! ");
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }
    public static void  swap(int a , int b){
        int temp = a ; 
        a = b ; 
        b = temp;    
        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);
    }

    // MULTIPLICATION OF TWO NUMBERS 
    public static int multiply(int a , int b ){
        int answer = a * b ; 
        return answer ;
    }

    //FACTORIAL OF A DIGIT  
    public static int factorial(int a){
        int answer = 1 ; 
        for (int i = 1 ; i <= a ; i ++ ){
            answer *= i ;
        }
        return answer;
        }
    public static int coefficient(int n , int r){
        int coff =  (factorial(n) ) / ((factorial(r) * factorial(n - r)));
        return coff ; 
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(coefficient(n, r));
    }

}
