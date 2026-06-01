
import java.util.ArrayList;

public class pairSum{
    public static boolean pairs(ArrayList<Integer> nums , int key ){
        int left = 0 ; 
        int right = nums.size() - 1 ; 
        while (left < right ){
            int curr = nums.get(left) + nums.get(right);
            if (curr == key){
                return true ;
            }else if (curr < key){
                left ++; 
            }else{
                right -- ; 
            }
        }
        return false ; 
    }
    public static void main(String nums[]){
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4);
        list.add(5);
        list.add(6); 

        System.out.println(pairs(list, 20));
    }
}