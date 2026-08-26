class Solution {
    public int scoreOfString(String s) {

        int ans = 0;
        for(int i = 1 ; i<s.length() ; i++){
            int a = s.charAt(i-1);
            int b = s.charAt(i);
            ans += Math.abs(a-b);
        }
        return ans;
    }
}