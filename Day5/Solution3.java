class Solution {
    public int bitwiseComplement(int N) {
        
       int bits=(int)(Math.floor(Math.log(N)/Math.log(2)))+1;
        
        return ((1<<bits)-1)^N;
        
        
       
        
    }
}
