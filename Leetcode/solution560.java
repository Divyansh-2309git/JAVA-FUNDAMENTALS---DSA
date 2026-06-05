public class solution560{
    public static int totalSubArraysSum(int[] nums , int k){
        int count = 0 ; 
        
        for (int i = 0 ; i < nums.length ; i ++ ){
            int currentSum = 0 ; 
            for (int j = i + 1 ; i < nums.length ; i ++ ){
                currentSum += nums[j]; 
                if(currentSum == k){
                    count ++ ; 
                }
            }
        }
        return count ; 
    }
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 3 , 4 , 5}; 
        System.out.println(totalSubArraysSum(nums, 10));
    }
}