package Arrays.Sorting;

public class bubbleSort {
    public static void bubbleSorting(int nums[]){
        for (int turn = 0 ;  turn < nums.length - 1 ; turn ++){
            for (int j = 0 ; j < nums.length - turn - 1 ; j ++ ){
                if(nums[j] > nums[j + 1 ]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp ; 

                }
            
            }
        }
        
    }
    public static void main(String[] args) {
        int nums [] = {5 , 4 , 1 , 3 , 2 };
        bubbleSorting(nums);
        for(int i = 0 ; i < nums.length ; i ++){
            System.out.println(nums[i]);
        }
        
        
    }
    
}
