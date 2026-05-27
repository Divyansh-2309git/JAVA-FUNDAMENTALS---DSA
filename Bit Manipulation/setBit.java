public class setBit {
    public static int setBit(int n , int i ){
        int bitMask = 1 << i ; 
        return n | bitMask ; 
    }    
    public static void main(String[] args) {
        int n = 10 ; 
        System.out.println(setBit(n, 3));
    }
}
