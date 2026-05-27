package Arrays;

public class maxSubArrays {
    public static void sumArrays(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int curr = 0 ;

        for (int i = 0 ; i < nums.length ; i  ++ ){
            for (int j = i ; j < nums.length ; j ++ ){
                curr = 0 ; 
                for ( int k = i ; k <= j ; k ++ ){
                    curr += nums[k];
                }
                System.out.println(curr);
            }
            if(curr> maxSum){
                maxSum = curr; 
            }
            System.out.println();
        }
        System.out.println("The maximum sum of the sub array is : " + maxSum);

    }

    public static void main(String args[]){
        int numbers[] = {
            2 , 4 , 6 , 8 , 10 
        };
        sumArrays(numbers);
    }
}
