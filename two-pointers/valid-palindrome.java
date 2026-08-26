class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        String ans = s.toLowerCase();    
        while(i<j){
            int a = ans.charAt(i);
            int b = ans.charAt(j);
            if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)){
                if(a==b){
                    i++;
                    j--;
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(!Character.isLetterOrDigit(a)){
                i++;
            }
            else{
                j--;
            }
        }
        return true;
    }

}