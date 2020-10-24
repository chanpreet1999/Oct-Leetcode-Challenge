class Solution {
    public int bagOfTokensScore(int[] tokens, int pow) {
        if(tokens.length == 0)
            return 0;
        
        Arrays.sort(tokens);
        int n = tokens.length;
        int i = 0, j = n-1;
        int curScore = 0, maxScore = 0;
        
        while(i <= j)
        {
            if(pow >= tokens[i])
            {
                pow -= tokens[i++];
                maxScore = Math.max(++curScore, maxScore);
            }
            
            else if(curScore > 0)
            {
                curScore--;
                pow += tokens[j--];
            }
            else
                return maxScore;
        }
        return maxScore;
    }
}