class Solution {
    public int bitwiseComplement(int N) {
        
     if(N==0)
        {
            return 1;
        }
        int res=0,fac=1;
        while(N>0)
        {
            res+=fac*(N%2==0 ? 1:0);
            fac*=2;
            N/=2;
                
        }
        return res;
        
    }
}
