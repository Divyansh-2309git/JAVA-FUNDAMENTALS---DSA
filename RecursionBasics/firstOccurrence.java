package RecursionBasics;

public class firstOccurance {
    public static int firstoccurance(int nums[] , int key , int i ){
        if (i == nums.length){
            return -1 ; 
        }
        if (nums[i] == key){
            return i ; 
        }

        return firstoccurance(nums, key, i + 1 );

    }
    public static void main(String[] args) {
        int nums[] = {3 , 2 , 7 , 4 , 9 , 2 , 0 , 4 , 6 , 5};
        System.out.println(firstoccurance(nums, 4, 0));
    }
}
