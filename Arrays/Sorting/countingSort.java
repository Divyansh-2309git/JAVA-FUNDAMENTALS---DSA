package Arrays.Sorting;

public class countingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE ; 
        for (int i = 0 ; i < arr.length ; i ++ ){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1 ] ; 
        for (int i = 0 ; i < arr.length ; i ++ ){
            count[arr[i]]++ ; 
            
        }
        // ! Sorting 
        int j = 0;
        for (int i = 0 ; i <count.length ; i ++){
            while (count[i] > 0){
                arr[j] = i ; 
                j ++ ; 
                count[i] -- ; 
            }
        }
        


    }
    public static void main(String[] args) {
        int nums[] = {1 , 2 , 1 , 3 , 5 , 3 , 4 , 7 };
        countingSort(nums);
        for(int i = 0 ; i < nums.length ; i ++){
            System.out.println(nums[i]);
        }
    }
    
}
