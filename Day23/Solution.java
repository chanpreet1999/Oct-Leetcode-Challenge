class Solution {
    public boolean find132pattern(int[] nums) {
        
        if(nums.length < 3)
            return false;
        
        int n = nums.length;
        int sol[] = smallerOnLeft(nums, n);
        Stack<Integer> st = new Stack<>();
        
        for(int j = n-1; j >= 0; j--)
        {
            if(nums[j] > sol[j])
            {
                while(!st.isEmpty() && st.peek() <= sol[j])
                    st.pop();
                
                if(!st.isEmpty() && st.peek()  < nums[j])
                    return true;
                
                st.push(nums[j]);
            }
        }
        
        
        return false;
    }
    
    
    int[] smallerOnLeft(int nums[], int n)
    {
        int ans[] = new int[n];
        ans[0] = nums[0];
        for(int i = 1; i < n; i++)
            ans[i] = Math.min( ans[i-1], nums[i] );
        
        return ans;
    }
    
    
}