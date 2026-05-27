package Arrays;

public class pairing {
    public static void pairs(int numbers[]){
        for (int i = 0 ; i <= numbers.length - 1 ; i ++ ){
            for (int j = i +1 ; j <= numbers.length - 1 ; j ++ ){

                System.out.print("(" + numbers[i] +"," + numbers[j] + ") ");
            }
        }
    }

    public static void main(String args[]){
        int numbers[] = {2 , 3 , 4 , 5};
        pairs(numbers);
        }


}


