class Solution {
    int st = 0;
    int ans = 1;
    public String longestPalindrome(String s) {

        if(s.length()<=1) return s;

        for(int i = 0 ; i<s.length() ; i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }

        return s.substring(st,st+ans);

    }

    public void expand(String s , int i , int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }

        int len = j - i - 1;

        if(len>ans){
            ans = len;
            st = i+1;
        }

    }
}