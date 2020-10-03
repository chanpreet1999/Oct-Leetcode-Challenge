class Solution {
    public int findPairs(int[] a, int k) {
        
        int i = 0, j = 1, count = 0;
        int n = a.length;
        if(n == 1)
            return 0;

        Arrays.sort(a);
        HashSet<Integer> hs = new HashSet<>();
        while( j < n)
        {
             if(i == j)
             {
                 j = i+1;
                 continue;
             }
            int diff = a[j] - a[i];
            
            if(diff == k  )
            {
                if(  !hs.contains(a[j]) )
                {
                    count++;
                    hs.add(a[j]);
                }
                i++;
                j++;
               
            }
            
            else if( diff < k )
                j++;
            else
                i++;
        }
        return count;
    }
}