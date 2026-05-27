package Arrays;

public class binarySearch {

    public static int binary(int numbers[] , int key){
        int start = 0 , end = numbers.length - 1 ; 
        while(start <= end ){
            int mid = (start + end) / 2 ;

            if(numbers[mid] == key){
                return mid; 
            }
            if (numbers[mid] < key){
                start = mid + 1 ;
            }
            else{
                end =  mid -1 ; 

            }
        }
        return -1 ;
    }

    public static void main (String args[]){
        int arr[] = {2 , 4 , 6 , 7 , 9 , 10 , 12 , 13 , 15 , 18};
        int key = 15 ; 
        System.out.println(binary(arr, key));
        
        
    }
    
}
