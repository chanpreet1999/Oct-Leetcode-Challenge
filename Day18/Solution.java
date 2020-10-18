class Solution {
    Integer dp[][][];
    public int maxProfit(int k, int[] prices) {
        
         if(k >= prices.length/2)
        {
            int maxProfit = 0;
            for(int i = 1; i < prices.length; i++)
            {
                if(prices[i] > prices[i-1])
                    maxProfit += prices[i] - prices[i-1];
            }
            return maxProfit;
        }
        
        dp = new Integer[prices.length+1][k+1][2];
        return helper(prices, k, 0, 1, 0);
    }
    
    int helper(int prices[], int k, int idx, int buy, int tx)
    {
        if( idx == prices.length || tx >= k )
            return dp[idx][tx][buy] = 0;
        
        if(dp[idx][tx][buy] != null)
            return dp[idx][tx][buy];
        
        
        if(buy == 1)
            return dp[idx][tx][buy] = Math.max( -prices[idx] + helper(prices, k, idx+1, 0, tx), helper(prices, k, idx+1, 1, tx)  );
        
        else
            return dp[idx][tx][buy] = Math.max( prices[idx] + helper(prices, k, idx+1, 1, tx+1), helper(prices, k, idx+1, 0, tx)  );
    
    }
}