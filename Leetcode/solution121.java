public class solution121{
    public static int maximumProfit(int[] prices) {
        int minPrice = prices[0] ; 
        int maxProfit = 0 ; 
        for (int i = 0 ; i < prices.length ; i ++ ){
            int profit = prices[i] - minPrice ; 
            maxProfit = Math.max(profit , maxProfit) ; 
            minPrice = Math.min(minPrice , prices[i]) ; 

        }
        return maxProfit ;
    }
    public static void main(String[] args) {
        int[] prices = {7,2,4,3,1, 6}; 
        System.out.println(maximumProfit(prices)) ; 
    }
}