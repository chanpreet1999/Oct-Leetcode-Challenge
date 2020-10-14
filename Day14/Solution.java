class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int dp[] = new int[nums.length + 2];
        
        Arrays.fill(dp, -1);
        int a1 = helper(nums, 0, 0, dp);
        
        Arrays.fill(dp, -1);
        int a2 = helper(nums, 1, 1, dp);
        
        return Math.max( a1 , a2 );
    }
    
    int helper(int nums[], int idx, int st, int dp[])
    {
        
        if((st == 0 && idx >= nums.length-1) || idx >= nums.length )
        {
            return dp[idx] = 0;
        }
        
        if(dp[idx] != -1)
            return dp[idx];
        
        int ra1 = nums[idx] + helper(nums, idx+2, st, dp );
        int ra2 = helper(nums, idx+1, st, dp );
        
        return dp[idx] = Math.max( ra1, ra2 );
    }
}