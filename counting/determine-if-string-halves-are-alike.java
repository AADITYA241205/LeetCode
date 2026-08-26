class Solution {
    public boolean halvesAreAlike(String s) {

        s = s.toLowerCase();
        int i = 0;
        int j = s.length()/2;

        int counta = 0;
        int countb = 0;
        while(i<(s.length()/2) && j<s.length()){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                counta++;
            }
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'){
                countb++;
            }
            i++;
            j++;
        }        

        return counta==countb;

    }
}