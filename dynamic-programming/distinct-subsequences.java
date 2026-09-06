class Solution {
    int count = 0;
    public int numDistinct(String s, String t) {
        sub(s,t,0,0);
        return count;
        
    }
    public void sub(String s , String t , int i , int j){
        if(j==t.length()){
            count++;
            return;
        }
        if(i==s.length()){
            return;
        }

        if(s.charAt(i)==t.charAt(j)){
            sub(s,t,i+1,j+1); 
        }

         sub(s,t,i+1,j);
    }
}