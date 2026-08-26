class Solution {
    public int countSegments(String s) {
        
        if(s.length()==0)return 0;
        int ans = 1;

        for(int i = 1 ; i<s.length() ; i++){
            if(s.charAt(i-1)!=' ' && s.charAt(i)==' '){
                ans++;
            }
        }
        
        if(s.charAt(0)==' ' && s.charAt(s.length()-1)==' ') return ans-1;
        if(s.charAt(s.length()-1)==' ')return ans-1;

        return ans;
        
    }
}