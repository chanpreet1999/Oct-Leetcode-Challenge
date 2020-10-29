class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        
        if(nums.length == 0)
            return new ArrayList<>();
        
        List<String> ans = new ArrayList<>();
        
        int si = nums[0], ci = nums[0], n = nums.length;
             
        for(int i = 1; i <= n; i++)
        {
            if(i != n && nums[i] == ci+1)
            {
                ci++;
            }
            else
            {
                if(si == ci)
                    ans.add( si + "" );
                else
                    ans.add( si + "->" + ci );               
                
                if(i == n)
                    break;
                
                si = nums[i];
                ci = nums[i];
                
            }
        }
        
        
        return ans;
    }
}