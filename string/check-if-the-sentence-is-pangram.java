class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        String s = "";
        for(int i = 0 ; i<sentence.length() ; i++){
            if(s.contains(sentence.charAt(i)+"")){
                continue;
            }
            else{
                s += sentence.charAt(i)+"";
            }
        }
        if(s.length()==26) return true;
        return false;
    }
}