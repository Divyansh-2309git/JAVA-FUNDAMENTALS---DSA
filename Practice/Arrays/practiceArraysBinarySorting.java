package Practice.Arrays;

public class practiceArraysBinarySorting {
    public static void binarySort(int nums[]){
        for (int i = 0 ; i < nums.length - 1 ; i ++ ){
            for (int j = 0 ; j < nums.length - i - 1 ; j ++ ){
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp ; 
                    
                }
            }
        }

    }
    public static void main(String[] args) {
        int nums [] = {3,6,2,1,8,7,4,5,3,1};
        binarySort(nums);
        for (int i = 0 ; i < nums.length ; i ++){
            System.out.println(nums[i]);
        }
    }
    
}
