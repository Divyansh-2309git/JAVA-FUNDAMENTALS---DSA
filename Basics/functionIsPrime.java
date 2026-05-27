import java.util.*;

public class functionIsPrime {
    public static boolean isPrime(int a ){
        if(a == 2){
            return true;
        }
        for (int i = 2 ; i <= Math.sqrt(a ); i++ ){
            if (a % i == 0) {
                return false ;
            }
        }
        return true;
    }


    // PRINTING THE PRIME NUMBERS IN THE GIVEN RANGE 
    public static void primesInRange(int a ){
        for (int i = 2 ; i <= a ; i ++){
            if(isPrime(i) == true){
                System.out.print(i +" ");

            }
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        primesInRange(a);;
    }
    
}
