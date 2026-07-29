public class getIThbit {
    public static int iThBIt(int num , int i ){
        int bitMask = 1 << i ; 
        if ((num & bitMask) == 0 ){
            return 0 ; 
        }else{
            return 1 ; 
        }

    }
    public static void main(String[] args) {
        int n = 10 ; 
        int i = 2 ; 
        System.out.println(iThBIt(n , i ));
    }
}
