package Arrays;

public class largestNumber {
    public static int largest(int numbers[]){
        int largestNum = numbers[0] ; 
        for (int i = 0 ; i < numbers.length ; i ++ ){
            if (numbers[i] > largestNum){
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }
    public static void main(String args[]){
        int numbers[]= {2 , 5 , 423, 2432 , 423, };
        int lar = largest(numbers);
        System.out.println(lar);
        
    }
    
}
