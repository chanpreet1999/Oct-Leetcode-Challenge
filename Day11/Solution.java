class Solution {

    public String removeDuplicateLetters(String str) {
        
        int lastIdx[] = new int[26];
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[26];
        
        for(int i = 0; i < str.length(); i++)
            lastIdx[ str.charAt(i) - 'a' ] = i;
        
        for(int i = 0; i < str.length(); i++)
        {    
            int idx = str.charAt(i)-'a';
            if(vis[idx])
                continue;
                
            while(!st.isEmpty() && st.peek() > idx &&  i < lastIdx[st.peek()] )
                vis[st.pop()] = false;
                
            st.push(idx);
            vis[idx] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append( (char)(st.pop() + 'a')  );
        
        return sb.reverse().toString();
    }
}