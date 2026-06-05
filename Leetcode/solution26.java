public class solution26{
    public static int removeDuplicate(int[] nums){
        int l = 0 ; 
        int count = 1 ;  
        for (int i = 0 ; i < nums.length ; i ++ ) {
            if (nums[l] != nums[i]){
                l ++ ; 
                count ++ ; 
                nums[l] = nums[i] ; 

            }
        }
        return count ; 


    }
    public static void main(String[] args) {
        int[] nums = {1 , 1 , 2 , 2 , 2 , 3 , 3 , 4} ; 

        System.out.println(removeDuplicate(nums));
        for (int i = 0 ; i < nums.length ; i ++) {
            System.out.print(nums[i]) ; 
        }
    }
}