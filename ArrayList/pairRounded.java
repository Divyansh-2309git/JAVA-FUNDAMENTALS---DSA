
import java.util.ArrayList;

public class pairRounded{
    public static boolean newpair (ArrayList<Integer> list , int target){
        int breakingPoint = -1 ; 
        int n = list.size(); 
        for (int i = 0 ; i < list.size() -1 ; i ++){
            if (list.get(i) > list.get(i + 1)){
                breakingPoint = i ; 
                break ; 
            }
        }
        int right = breakingPoint; 
        int left = breakingPoint + 1 ; 
        while (left != right){
            int curr = list.get(left) + list.get(right) ; 
            if (curr == target){
                return true ; 
            }
            if (curr > target ){
                right = (n + right - 1 ) % n ; 
            }else{
                left = (left + 1 ) % n ; 
            }
        }
        return false ; 
        
    }
    public static void main(String[] aStrings){
         ArrayList<Integer> list = new ArrayList<>(); 
        list.add(5);
        list.add(6); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4);

        System.out.println(newpair(list, 11));
    } 
}