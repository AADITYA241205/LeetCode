class Solution {
    public int countRotations(String s, int k) {

        StringBuilder str = new StringBuilder(s);
        int ans = 0;
        
        for(int i = 0 ; i<s.length() ; i++){
            str.deleteCharAt(0);
            str.append(s.charAt(i));

            int score = 0;
            for(int j = 1 ; j<str.length() ; j++){
                if(str.charAt(j)==str.charAt(j-1)){
                    score++;
                }
            }

            if(score==k)ans++;
            
        }
        return ans;
    }
}