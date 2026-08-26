class Solution {
    public String removeOuterParentheses(String s) {

        int c1 = 0;
        int c2 = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i<s.length() ; i++){
            
            
            if(s.charAt(i)=='('){
                c1++;
            }
            else{
                c2++;
            }
            
            if(c1!=1 && c1!=c2){
                str.append(s.charAt(i));
            }

            if(c1==c2){
                c1=0;
                c2=0;
            }


        }
        return str.toString();
    }
}