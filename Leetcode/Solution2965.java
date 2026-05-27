package Leetcode;

public class Solution2965 {
    public static int[] ans(int[][] grid){
        int n = grid[0].length ; 
        int N = n * n ; 
         
        int[] freq = new int[n * n + 1];
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j++){
                int num = grid[i][j];
                freq[num] ++ ; 
            }
        }
        int repeated = -1 ; 
        int missing = -1 ; 
        for (int i = 1 ; i < freq.length ; i ++){
            if (freq[i] == 2){
                repeated = i ; 
            }
            if (freq[i] == 0 ){
                missing = i ; 
            }
        }
        return new int[]{repeated , missing }; 
    }
    public static void main (String args[]){
        int [][] grid = {[1,3],[2,2]};
        System.out.pritnln(ans(grid)); 
    }    
} 
