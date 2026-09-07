class Solution {
    public int balancedStringSplit(String s) {

        int c = 0 ;
        int count = 0;

        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)=='L')c--;
            if(s.charAt(i)=='R')c++;

            if(c==0){
                count++;
            }
            
        }
        
        return count;
    }
}