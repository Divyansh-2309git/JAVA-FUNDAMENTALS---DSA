public class searchInSortedMatrix {
    public static boolean search(int matrix[][] , int key){
        int row = 0 , col = matrix.length - 1 ; 
        while (row <matrix.length  && col >= 0){
            if (matrix[row][col] == key){
                System.out.print("The key exists at" + row + " " + col); 
                return true ; 
            }
            if (matrix[row][col] > key){
                col -- ; 
            }
            if (matrix[row][col] < key){
                row ++  ;
            }
        }
        System.out.println("The key does not exists in the matrix .");
        return false ; 

    }
    public static void main(String[] args) {
        int matrix[][] = {{10 , 20 , 30 , 40 } , 
                          {15 , 25 , 35 , 45 } , 
                          {27 , 29 , 37 , 48 },
                          {32 , 33 , 49 , 50 }};
        search(matrix, 33);

    }    
}
