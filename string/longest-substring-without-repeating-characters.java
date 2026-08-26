class Solution {
    public int lengthOfLongestSubstring(String s) {

        int ans = 0;
        for(int i = 0 ; i<s.length() ; i++){
            StringBuilder str = new StringBuilder();
            for(int j = i ; j<s.length() ; j++){
                int a = str.indexOf(s.charAt(j)+"");
                if(a==-1){
                    str.append(s.charAt(j));
                }
                else{
                    break;
                }

            }
            ans = Math.max(str.length(),ans);
        }

    return ans;   
    }
}