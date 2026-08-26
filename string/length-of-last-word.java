class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int count = 0;
        for(int i = s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)==' ' && !flag){
                continue;
            }
            else if(s.charAt(i)!=' '){
                count++;
                flag = true;
            }
            else{
                break;
            }
            
        }
        return count;
    }
}