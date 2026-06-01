public class numInDec{
    public static void decreasing(int num) {
        if (num == 0 ){
            return ; 
        }
        System.out.println(num);
        decreasing(num - 1 );
    }
    public static void main(String[] args) {
        int num = 4; 
        decreasing(num);
    }
}