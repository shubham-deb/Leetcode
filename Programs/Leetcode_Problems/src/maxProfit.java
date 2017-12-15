
public class maxProfit {

    public static int profit(int[] prices) {
        
        if(prices.length<=1) return 0;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
        	if(prices[i]>prices[i-1])
        		maxProfit += prices[i] - prices[i-1]; 
        }
        return maxProfit;
    }
	
	public static void main(String[] args) {
		int[] prices = {2,1,2,0,1};
		System.out.println(profit(prices));
	}

}
