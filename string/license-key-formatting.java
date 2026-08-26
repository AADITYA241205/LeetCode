class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        int n = k;
        StringBuilder str = new StringBuilder();
        for(int i = s.length()-1 ; i>=0 ; i--){
            if(k>0){
                if(s.charAt(i)=='-')continue;
                str.append(s.charAt(i));
                k--;
            }
            else{
                if(s.charAt(i)=='-')continue;
                str.append("-");
                k = n;
                i++;
            }

        }
        
        return str.reverse().toString().toUpperCase();

    }
}