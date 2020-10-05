class Solution {
    public int bitwiseComplement(int N) {
        String bin = Integer.toBinaryString(N);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
                bin = bin.substring(0, i)  + '0'  + bin.substring(i+ 1); 
            else
         bin = bin.substring(0, i)  + '1'  + bin.substring(i+ 1); 
        }
        int decimal=Integer.parseInt(bin,2);
        return decimal;
    }
}
