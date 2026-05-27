package Arrays;

public class reversing {
    public static void rev(int numbers[] ){
        int first = 0 , last = numbers.length - 1 ; 
        
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first ++ ;
            last --;

        }
    }


    

    public static void main(String args[]){
        int numbers[] = {2 , 4 , 5 , 6 , 2 , 3 ,6 , 3 , 6 };
        rev(numbers);
        for (int i = 0 ; i <= numbers.length - 1 ; i ++ ){
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
    
}
