class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        int  n = intervals.length;
        if(n == 1)
            return 1;
        
        
        Arrays.sort( intervals, (a, b)->{
            if(a[0] == b[0])
                return b[1]-a[1];   //decending order of rnd time
            
            return a[0] - b[0];     //ascending order of start time
        });
        
        
        int  i = 0, count = 1, st = intervals[0][0], end = intervals[0][1];
        while(i < n)
        {
            if( st <= intervals[i][0] && end >= intervals[i][1] )
            {
                i++;
            }
            else
            {
                st = intervals[i][0];
                end = intervals[i][1];
                count++;
                i++;
            }
        }       
        return count;
    }
        
}
    