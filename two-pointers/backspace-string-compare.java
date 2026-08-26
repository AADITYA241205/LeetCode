class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)!='#'){
                str1.append(s.charAt(i));
            }
            else{
                if(str1.length()==0)continue;
                str1.deleteCharAt(str1.length()-1);
            }
        }

        for(int i = 0 ; i<t.length();i++){
            if(t.charAt(i)!='#'){
                str2.append(t.charAt(i));
            }
            else{
                if(str2.length()==0)continue;
                str2.deleteCharAt(str2.length()-1);
            }
        }

        if(str1.compareTo(str2)==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}