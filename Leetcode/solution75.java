public class solution75{
    public static void sort(int[] nums){
        int l = 0 ; 
        int r = nums.length - 1 ; 
        int i = 0 ; 
        while (i <= r ){
            if(nums[i] == 0 ){
                int temp = nums[l] ; 
                nums[l] = nums[i] ; 
                nums[i] = temp ; 
                i ++ ; 
                l ++ ; 
            }
            else if(nums[i] == 1 ){
            i ++ ; 
            }
            else {
                int temp = nums[r] ; 
                nums[r] = nums[i] ; 
                nums[i] = temp ; 
                r -- ; 
                
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1 , 1 ,2 , 2 , 0 , 0 ,2 ,1 , 2  , 0 } ; 
        sort(nums) ; 
        for (int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}