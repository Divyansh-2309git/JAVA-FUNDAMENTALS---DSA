/**
 * Program Name : solution238
 * Topic        : LeetCode / Arrays
 * Difficulty   : Medium (238. Product of Array Except Self)
 * Concepts     : Prefix & Suffix Products, O(N) Time Optimization
 * -------------------------------------------------------------
 * Description  :
 * Returns an array where ans[i] is equal to the product of all elements of nums except nums[i].
 */
public class solution238 {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Calculate Prefix Products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Multiply by Suffix Products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = productExceptSelf(nums);
        System.out.print("Product of array except self: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
