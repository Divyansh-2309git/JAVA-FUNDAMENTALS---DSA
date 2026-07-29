/**
 * Program Name : solution121
 * Topic        : LeetCode / Dynamic Programming & Arrays
 * Difficulty   : Easy (121. Best Time to Buy and Sell Stock)
 * Concepts     : Single-Pass Tracking, Minimum Price Tracking, Dynamic Programming
 * -------------------------------------------------------------
 * Description  :
 * Finds maximum profit achievable by buying stock on one day and selling on a future day.
 */
public class solution121 {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Stock Profit: " + maxProfit(prices));
    }
}
