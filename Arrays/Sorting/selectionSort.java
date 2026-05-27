package Arrays.Sorting;

public class selectionSort {
    public static void selectionSort(int nums[]){
        for (int i = 0 ; i < nums.length - 1 ; i ++){
            int min = i ; 
            for (int j = i + 1 ; j < nums.length  ; j ++){
                if(nums[min] > nums[j]){
                    min = j ; 
                }
            }
            int temp = nums[min] ; 
            nums[min] = nums[i];
            nums[i] = temp ; 
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5 , 4 , 2 , 1 , 3};
        selectionSort(numbers);
        for(int i = 0 ; i < numbers.length ; i ++){
            System.out.print(numbers[i]);
        }
    }
    
}
