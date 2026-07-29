
public class isEvenOrOdd {
    public static void isEvenOrOdd(int n ){
        int bitMask = 1 ; 
        if((n & bitMask) == 1){
            System.out.println("The number is odd ");
        }else{
            System.out.println("The number is even");
        }
    }
    public static void main(String[] args) {
        int n = 5 ; 
        isEvenOrOdd(n);
    }
}
