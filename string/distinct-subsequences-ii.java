class Solution {
    public int distinctSubseqII(String s) {

        long mod = 1000000007;
        long total = 1;
        long[] arr = new long[26];

        for(int i = 0 ; i<s.length() ; i++){
            int id = s.charAt(i)-'a';
            long old = total;
            total = (2*total - arr[id] + mod) % mod;
            arr[id] = old ;

        }
        
        return (int)((total-1+mod)%mod);
    }
}