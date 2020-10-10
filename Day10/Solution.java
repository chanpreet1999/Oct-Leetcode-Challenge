class Solution {
    public int findMinArrowShots(int[][] points) {
        if( points.length == 0 )
            return 0;
        
        int arrows = 1, n = points.length;
        
        Arrays.sort( points, (a,b)->{
            return a[1] > b[1] ? 1 : -1;    //not subtracting coz it goes out of the limits
        } );
        
        int end = points[0][1];
        for(int i = 1; i < n; i++)
        {
            if( points[i][0] > end )
            {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }
}