class Solution {
    public int minDominoRotations(int[] a, int[] b) {
        if(a.length == 0)
            return 0;
        
        int n = a.length;
        //a0: swaps req for placing the element at a[0] in the whole array "a"
        //a1: swaps req for placing the element at b[0] in the whole array "a"
        //b0: swaps req for placing the element at a[0] in the whole array "b"
        //b1: swaps req for placing the element at b[0] in the whole array "b"
        int a0 = 0, a1 = 0, b0 = 0, b1 = 0;
        
        int MAX = (int)1e5;
        
        for(int i = 0; i < n; i++)
        {
            //a0
            if( a[i] != a[0] )
            {
                if(b[i] == a[0])
                    a0++;
                else
                    a0 = MAX;
            }
            
            
            //a1
            if( a[i] != b[0] )
            {
                if(b[i] == b[0])
                    a1++;
                else
                    a1 = MAX;
            }
            
             //b0
            if( b[i] != a[0] )
            {
                if(a[i] == a[0])
                    b0++;
                else
                    b0 = MAX;
            }
            
            
            //b1
            if( b[i] != b[0] )
            {
                if(a[i] == b[0])
                    b1++;
                else
                    b1 = MAX;
            }
        }
        
        int ans = Math.min( Math.min( a0, a1 ), Math.min( b0, b1 ) );
        return ans >= MAX ? -1 : ans;
    }
}