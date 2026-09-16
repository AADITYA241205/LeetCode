class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int ans = 0;

        for(int i = 0 ; i<s.length() ; i++) {
            char ch = s.charAt(i);
            freq[ch-'A']++;

            if(freq[ch-'A'] % 2 == 0) {
                ans += 2;
            }
        }

        if(ans < s.length()) {
            ans++;
        }

        return ans;
        
    }
}