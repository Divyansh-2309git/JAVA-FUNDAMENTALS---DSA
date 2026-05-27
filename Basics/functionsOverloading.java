// public class functionsOverloading {
//     public static int sum(int a , int b ){
//         int s = a + b ; 
//         return s ; 
//     }
//     public static int sum(int a , int b , int c ){
//         int s = a + b + c ;
//         return s ;
//     }
//     public static void main (String args[]){
//         int a = 5 ; 
//         int b = 3 ; 
//         System.out.println(sum(a, b));

//     }    
// }



//  functions overloading with different data types 
public class functionsOverloading {
    
    public static int sum(int a, int b ){
        int s = a + b ; 
        return s ; 
    }    
    public static float sum(float a , float b){
        float s = a + b ; 
        return s ;
    }
    
    public static void main (String args[]){
        float a = 10.4f;
        float b = 20.23f ;
        int x = 5  ;
        int d = 23;

        System.out.println(sum(a, b));
        System.out.println(sum(x, d));
    };
}



