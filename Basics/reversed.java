public class reversed {
    public static void main(String args[]){
        int a = 101 ;
        int reversed = 0 ; 
        while (a != 0 ){
            reversed = (reversed * 10 ) + (a % 10);
            a = a/10 ;
            
        }
        System.out.println(reversed);
    }
}
