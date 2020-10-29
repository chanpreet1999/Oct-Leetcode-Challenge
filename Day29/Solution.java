class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int first = -1, n = seats.length, maxDist = -1;
        
        for(int i = 0; i < n; i++)
        {
            if(seats[i] == 1)
            {
                if(first == -1)
                {
                    maxDist = i > maxDist ? i : maxDist;
                }
                else
                {
                    int dist = i-first;
                    if(dist%2 == 0)
                        maxDist = Math.max( maxDist, (dist+1)/2  );
                    else
                        maxDist = Math.max( maxDist, dist/2 );
                }
                first = i;
            }
        }
        
        if( seats[n-1] == 0 )
            maxDist = Math.max( maxDist, n-1-first );
        return maxDist;
    }
}