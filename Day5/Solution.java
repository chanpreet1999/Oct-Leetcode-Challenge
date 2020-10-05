class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
        
        String complimentedNum = decimalToBinaryComplement( n );
        return complementToDecimal( complimentedNum );
    }
    
    String decimalToBinaryComplement( int n )
    {
        String str = "";
        
        while(n > 0)
        {
            int rem = n%2;
            
            rem = rem ==1 ? 0 : 1;
            str = rem + str;
                
            n = n/2;
        }
        
        return str;
    }
    
    
    int complementToDecimal(String str)
    {
        int p = 0;
        int ans = 0;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            int rem = str.charAt(i) - '0';
            ans = ans + (rem * (int)Math.pow(2, p++) );
            
        }
        
        return ans;
    }
    
}