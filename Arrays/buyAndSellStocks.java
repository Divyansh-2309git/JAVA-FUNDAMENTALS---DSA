package Arrays;

public class buyAndSellStocks {
    public static int maxProfit(int stocks[]){
        int minBuy = stocks[0] ; 
        int sell = stocks[0];
        int maxPro = 0 ; 
        int n = stocks.length;
        for (int i = 1 ; i  < n ; i ++  ){
            minBuy = Math.min(minBuy , stocks[i]);
            sell = stocks[i] ;
            int currProfit = sell - minBuy ; 
            maxPro = Math.max(maxPro, currProfit);

        }
        return maxPro;
    }
    public static void main(String[] args) {
        int stocks[] = {7 , 1 , 6 , 10 , 5 , 7 };
        System.out.println(maxProfit(stocks));
    }
    
}
