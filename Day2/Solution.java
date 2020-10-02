class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> smallAns = new ArrayList();
        
        helper(candidates, 0, target, smallAns, ans);
        
        return ans;
    }
    
    void helper( int a[], int idx, int tar, List<Integer> smallAns, List<List<Integer>> ans )
    {
        if( idx == a.length || tar == 0 )
        {
            if(tar == 0)
            {
                List<Integer> temp = new ArrayList( smallAns );
                ans.add( temp );
            }
            return;
        }
        
        
        for(int i = idx; i < a.length; i++ )
        {
            if( tar-a[i] >= 0 )     // pro active calls
            {
                smallAns.add( a[i] );
                helper( a, i, tar-a[i], smallAns, ans );
                smallAns.remove( smallAns.size()-1 );
            }
        }
    }
}