
import java.util.*;

public class creation {
    public static boolean search(int matrix[][] , int key){
        for (int i = 0 ; i < matrix.length ; i ++){
            for (int j = 0 ;j < matrix.length ; j ++ ){
                if (matrix[i][j] == key){
                    System.out.println("The key exists on (" + i + " , " + j +")");
                    return true ; 
                }
            }
        }
        return false ; 
    }
    public static void main(String args[]){
        int matrix [][] = new int[3][3];
        int n = 3 , m = 3 ; 
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < m ; j ++ ){
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = 3 ; 
        search(matrix, key);
       
    }
        
}

    

