class Solution {
    public int findNumberOfLIS(int[] a) {
        
        if(a.length == 0 || a.length == 1)
            return a.length;
        
        int maxCount = 1,  maxLen = 1;
        int n = a.length;
        int count[] = new int[n];
        int dp[] = new int[n];
        
        dp[0] = 1;
        
        Arrays.fill( count, 1 );
        for(int i = 1; i < n; i++)
        {
            dp[i] = 1;
            for(int j = 0; j < i; j++)
            {
                if( a[i] > a[j] )
                {
                    if(dp[i] <= dp[j]+1)
                    {
                        if(dp[i] < dp[j]+1)
                            count[i] = count[j];
                        else
                            count[i] += count[j];
                        
                        dp[i] = dp[j]+1;
                        
                    }
                }
            }
            if( dp[i] > maxLen )
            {
                maxCount = count[i];
                maxLen = dp[i];
            }
            else if(dp[i] == maxLen)
            {
                maxCount += count[i];
            }
        }
        
        return maxCount;
        
    }
}