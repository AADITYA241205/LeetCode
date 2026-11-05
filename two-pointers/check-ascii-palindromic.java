class Solution {
    public boolean isPalindromic(String s) {

        StringBuilder sb= new StringBuilder();

        for(int i = 0 ; i<s.length() ; i++){
            int a = s.charAt(i);
            String bs = Integer.toBinaryString(a);
            String ps = String.format("%8s", bs).replace(' ', '0');
            sb.append(ps);
        }

        int i = 0;
        int j = sb.length()-1;

        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}