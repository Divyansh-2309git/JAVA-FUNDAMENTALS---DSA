public class solution53{
    public static int maxSubArraySum(int[] nums) {
        int curr = 0 ; 
        int maxSum = Integer.MIN_VALUE; 
        for (int i = 0 ; i < nums.length ; i ++ ){
                curr += nums[i] ; 
                if(curr < 0 ){
                    curr = 0 ; 
                }
                maxSum = Math.max(curr , maxSum) ; 
                
        }
        if (maxSum > 0 ){
            return maxSum ; 
        }else {
            maxSum = nums[0]; 
            for (int i = 0 ; i < nums.length ; i ++ ){
                maxSum = Math.max(maxSum , nums[i]) ; 
            }
            return maxSum ; 
        }

    }
    public static void main(String[] args) {
        int[] nums = {-3 , -4 , -6 , -8 , -2 , -5 } ; 
        System.out.println(maxSubArraySum(nums)) ; 
    }
}