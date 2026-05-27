package RecursionBasics;

public class fibonacci {
    public static int fib(int n ){
        if (n == 0 ){
            return 0;
        }
        if (n == 1 ){
            return 1 ;
        }
        int fb = fib(n - 1) + fib(n - 2) ; 
        return fb;
    }
    public static void main(String[] args) {
        int n = 6 ; 
        System.out.println(fib(n));
    }
}
