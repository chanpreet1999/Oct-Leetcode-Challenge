class Solution1 {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
                return b[1]-a[1];
            return a[0]-b[0];
        });
       int remove=0;
        int min=-1;
        for(int i=0;i<n;i++)
        {
            if(intervals[i][1]<=min)
                remove++;
            else
                min=intervals[i][1];
        }
        return n-remove;
    }
}
