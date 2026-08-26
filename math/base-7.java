class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String s = "";
        String rev = "";
        if(num<0){
            num=num*-1 ;
            rev = "-";
        }
        int q = num;
        while(q!=0){
            s = s + q%7;
            q = q/7;
        }

        for(int i = s.length()-1 ; i>=0 ; i--){
            rev = rev + s.charAt(i);
        }

        return rev;
    }
}