class Solution {
    public int myAtoi(String s) {

        int i = 0;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }

        long ans = 0;
        
        return num(s,i,sign,ans);
    }

    public int num(String s , int i , int sign , long ans){
        
        if(i==s.length()){
            if(sign==-1)ans*=sign;
            return (int)ans;
        }

        char a = s.charAt(i);
        if(a<'0' || a>'9'){
            if(sign==-1)ans*=sign;
            return (int)ans;
        }   

        int dg = a - '0';

        ans = ans*10+dg;
        if(sign==1 && ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(sign==-1 && (ans*sign)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return num(s,i+1,sign,ans);
    }
}