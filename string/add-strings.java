class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder str = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;

            if(i>=0){
                int n = num1.charAt(i) - '0';
                sum +=n;
                i--;
            }

            if(j>=0){
                int n = num2.charAt(j) - '0';
                sum +=n;
                j--;
            }

            str.append(sum%10);
            carry = sum/10;

        }

        return str.reverse().toString();
    }
}