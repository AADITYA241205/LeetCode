class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1)return s;

        int n = numRows;
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0 ; i < n ; i++){
            rows[i] = new StringBuilder();
        }
        int c = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(c<n){
                rows[c].append(s.charAt(i));
                c++;

            }
            else{
                c=n-2;
                while(c!=0 && i<s.length()){
                    rows[c].append(s.charAt(i));
                    c--;
                    i++;
                }
                i--;
            }
        }

        StringBuilder str = new StringBuilder();

        for(StringBuilder row:rows){
            str.append(row);
        }

        return str.toString();
        
    }
}