class Solution {
    public int vowelConsonantScore(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int v = 0 ;
        int c = 0 ;
        for(char b : s.toCharArray()){
            if(Character.isLetter(b)){
                if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' ){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        if(c==0){
            return 0;
        }
        else{
            return v/c;
        }
        
    }
}