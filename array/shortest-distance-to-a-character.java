class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] ans = new int[s.length()];
        
        int j = -s.length();

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i)==c){
                j=i;
            }

            ans[i] = i- j;
        }

        j=s.length();

        for(int i = s.length()-1; i>=0; i--){

            if(s.charAt(i) == c){
                j=i;
            }

            ans[i]=Math.min(ans[i], j - i);
        }

        return ans;
        
    }
}