class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder sb = new StringBuilder();
        int count = 0;
        StringBuilder sbtl = new StringBuilder();
        for(int i = s.length()-1 ; i>-1 ; i--){
            if(s.charAt(i)!=' '){
                count = 0;
                sbtl.append(s.charAt(i));
            }
            else if(count==0){
                count++;
                sbtl.reverse();
                sb.append(sbtl+" ");
                sbtl.setLength(0);
            }
        }
        sbtl.reverse();
        sb.append(sbtl);
        int i = 0;
        int j = sb.length()-1;
        
        while (sb.length() > 0 && sb.charAt(0) == ' ') {
        sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
        sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}