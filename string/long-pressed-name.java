class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = i;
        int cn = 1;
        int ct = 0;
        StringBuilder str = new StringBuilder(typed);
        while(i<name.length()){

            if(i<name.length()-1 && name.charAt(i)==name.charAt(i+1)){
                cn++;
                i++;
                continue;
            }
        
            
            if(j<typed.length() && name.charAt(i)==typed.charAt(j)){
                ct++;
                j++;
                continue;
            }

            if(cn>ct){
                return false;
            }
            cn = 1;
            ct = 0;
            i++;
        }

        while(j<typed.length()){
            if(name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }

        return true;
    }
}