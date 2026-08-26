class Solution {
    public boolean isCircularSentence(String sentence) {

        for(int i = 1 ; i<sentence.length()-1 ; i++){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i-1)==sentence.charAt(i+1)){
                    continue;
                }
                else{
                    return false;
                }

            }
        }

        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
        }
        else{
            return false;
        }
        
        return true;
    }
}