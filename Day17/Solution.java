class Solution {
    public List<String> findRepeatedDnaSequences(String str) {
        
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        
        for( int i = 0; i <= str.length()-10; i++ )
        {
            String temp = str.substring( i, i+10 );
            hm.put( temp, hm.getOrDefault( temp, 0 )  + 1 );
        }
        
        for(String key : hm.keySet() )
        {
            if( hm.get(key) > 1 )
                ans.add(key);
        }
        
        return ans;
    }
}