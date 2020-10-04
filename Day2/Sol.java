class Solution {
    List<List<Integer>> finalans=new ArrayList<>();
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> ans=new ArrayList<>();
       solve(candidates,0,target,ans);
       return finalans;
       
   }
   public void solve(int[] arr,int idx, int tar, List<Integer> ans)
   {
       if(tar==0)
       { 
           List<Integer> helper=new ArrayList<>(ans);
           finalans.add(helper);
           return;
       }
        for(int ele=idx;ele<arr.length;ele++){
            if(tar-arr[ele]>=0)
            {
             ans.add(arr[ele]);
            solve(arr,ele,tar-arr[ele],ans);
            ans.remove(ans.size()-1);
            }
       }
   
   }
}
