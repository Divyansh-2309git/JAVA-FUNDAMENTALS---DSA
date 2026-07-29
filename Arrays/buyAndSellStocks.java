/**
 * Program Name : buyAndSellStocks
 * Topic        : Arrays
 * Difficulty   : Intermediate
 * Concepts     : Single-Pass Dynamic Tracking, Greedy Approach
 * -------------------------------------------------------------
 * Description  :
 * Calculates the maximum profit achievable by buying and selling a stock once (LeetCode 121).
 */
public class buyAndSellStocks {

    public static int maxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            int currentProfit = prices[i] - minBuyPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}
