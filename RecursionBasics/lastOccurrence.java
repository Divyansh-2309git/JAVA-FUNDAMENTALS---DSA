package RecursionBasics;

public class lastOccurance {

    public static int last(int nums[], int key, int i) {

        if (i == nums.length) {
            return -1;
        }

        int isFound = last(nums, key, i + 1);

        // If found later, return that index
        if (isFound != -1) {
            return isFound;
        }

        // Otherwise check current index
        if (nums[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2, 5, 3, 65, 2, 6, 3, 6, 8, 5, 3};

       System.out.println(last(nums, 5, 0));
    }
}suyte m is 
{
    System.out.println()
}