class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1;
        for(int i = 0 ; i<sentences.length ; i++){
            int count = 1;
            String s = sentences[i];
            for(int j = 0 ; j<s.length() ; j++){
                if(s.charAt(j) == ' '){
                    count++;
                }
            }
            max = Math.max(count,max);
        }

        return max;
        
    }
}