public class numInInc{
    public static void increasing (int num){
        if(num == 0 ){
            return ; 
        }
        increasing(num - 1 );
        System.out.println(num); 
        
    }

    public static int  factorial(int n ){
        if (n == 0 ){
            return 1 ; 
        }
        int fn = n * factorial(n - 1 ); 
        return fn; 
    }
    public static void main(String args[]){
        int n = 5 ; 
        System.out.println(factorial(n));
    }
}