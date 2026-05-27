import java.util.*;

public class binaryToDecimals {
    public static int toDec(int a ){
        int sum = 0 ;
        int i = 0; 
        while (a > 0){
            sum += (a % 10) * Math.pow(2, i) ;
            a /= 10 ; 
            i ++ ; 
        }
        return sum ;

    }

    // TO CONVERT THE GIVEN DECIMAL NUMBER TO BINARY NUMBER 
    public static int tobin(int a ){
        int sum = 0 ;
        int pow = 0 ;
        while (a > 0){
            sum += (a % 2 ) * Math.pow(10 , pow) ;
            a = a / 2 ; 
            pow ++ ;
        }
        return sum ; 
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(tobin(a));
    }
}
