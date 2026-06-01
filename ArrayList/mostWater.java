
import java.util.ArrayList;

public class mostWater{
    public static int most (ArrayList<Integer> nums){
        int left = 0 ; 
        int right = nums.size() -1 ; 
        int maxWater = 0 ; 
        while(left < right ){
            int height = Math.min(nums.get(right) , nums.get(left)); 
            int width = right - left ; 
            int currentWater = height * width ;
            maxWater = Math.max(currentWater , maxWater); 
            if (nums.get(left)< nums.get(right)){
                left ++ ; 
            }else{
                right -- ; 
            }

        }
        return maxWater; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(); 
        height.add(1); 
        height.add(8); 
        height.add(6);
        height.add(2); 
        height.add(5); 
        height.add(4); 
        height.add(8);
        height.add(3); 
        height.add(7);

        System.out.println(most(height)); 
    }
}