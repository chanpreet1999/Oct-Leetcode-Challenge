class Solution {
    Boolean dp[] = new Boolean[100000];
    public boolean winnerSquareGame(int n) {
        if(n == 0)
            return dp[n] = false;
        
        if(dp[n] != null)
            return dp[n];
        
        boolean winner = false;
        
        for(int i = 1; i*i <= n; i++)
        {
            if(!winnerSquareGame(n- i*i))
            {
                winner = true;
                break;
            }
        }
        
        return dp[n] = winner;
    }
}