class Solution {
    public int[] asteroidCollision(int[] a) {
        
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1; i >= 0; i--)
        {
            boolean destroyed = false;
            while(!st.isEmpty() && a[i] > 0 && a[st.peek()] < 0)
            {
                if(a[i] < Math.abs(a[st.peek()]) )
                {
                    //destroyed
                    destroyed = true;
                    break;
                }
                else if( a[i] == Math.abs(a[st.peek()]) )
                {
                    st.pop();
                    destroyed = true;
                    break;
                }
                else if(a[i] > Math.abs(a[st.peek()]) )
                {
                    st.pop();
                }
                
            }
            if(!destroyed)
                st.push(i);
        }
        
        n = st.size();
        int ans[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            ans[i] = a[st.pop()];
        }
        
        return ans;
    }
}