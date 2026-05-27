package Arrays;

public class maxSumArray3 {
    public static int SumArray(int numbers[]){
        int maxSum =  Integer.MIN_VALUE;
        int currSum = 0 ; 
        for (int i = 0 ; i < numbers.length ; i ++){
            currSum = currSum + numbers[i]; 
            System.out.println(currSum); 
            if (currSum < 0 ){
                currSum = 0 ;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 };
        // System.out.println( SumArray(numbers));
       
    }
    
}
