package Practice.Recursion;

public class question1 {
    public static void repeat(int nums[] , int key , int index){
        if (index == nums.length){
            return;
        }
        if(nums[index] == key){
            System.out.print(index + " ");
        }
        repeat(nums, key, index + 1);

        
    }
    public static void main(String args[]) {
        int nums[] = {3 , 2 , 5 , 2, 8 , 7 , 2 , 2, 9 , 2 };
        repeat(nums, 2, 0);
    }
}
