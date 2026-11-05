class Solution {
    public boolean checkValidString(String s) {

        int c = 0;
        int h = 0;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i)=='*'){
                c--;   
                h++;
            }
            else if(s.charAt(i)=='('){
                c++;
                h++;
            }
            else{
                c--;
                h--;
            }

            if(h<0){
                return false;
            }

            if(c<0){
                c = 0;
            }
        }

        return c == 0;
    }
}