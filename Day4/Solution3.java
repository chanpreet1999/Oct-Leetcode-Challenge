class Solution3 {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int [] curr=new int[]{-1,-1};
        int res=0;
        for(int[] arr:intervals)
        {
            if(arr[0]>curr[0] && arr[1]>curr[1])
            {
                curr[0]=arr[0];
                res++;
            }
            
            curr[1]=Math.max(curr[1],arr[1]);
        }
        
        return res;
        
    }
}
