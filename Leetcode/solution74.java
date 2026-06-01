public class solution74{
    public static boolean   answer(int[][] matrix , int target ){
        int row = 0 ; 
        int nums = matrix.length ; 
        int lastnum = matrix[0].length - 1; 
        while (row < nums){
            if(target > matrix[row][lastnum] ){
                row++ ;
            }else{
                for (int i = 0 ; i <= lastnum ; i ++){
                    if (matrix[row][i] == target){
                        return true;
                    }
                }
                return false; 
            }
        }
        return false; 
    }

    public static void main(String[] args){
        int [][] matrix = {{1 , 3 , 5 , 7} , {9 , 11 , 13, 15}};
        System.out.println(answer(matrix,71));
    }
}