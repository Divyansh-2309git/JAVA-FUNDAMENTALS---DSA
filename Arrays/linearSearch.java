package Arrays;

public class linearSearch {
    public static int linearsearch(int numbers[] , int key){
        for (int i = 0 ; i < numbers.length ; i ++ ){
            if (numbers[i] == key){
                return numbers[i] ;
            }
        }
        return -1 ;
            
        

    };
    public static void main (String args[]){
        int numbers[] = {2 , 14 , 15 , 20 , 10 , 56 , 123 , 232};
        int key = 20 ; 
        int index = linearsearch(numbers, key);
        if (index == -1){
            System.out.println("The key does not exists in the given array.");
        }
        else{
            System.out.println("The key exists in the array.");
        }
    }


    
}
