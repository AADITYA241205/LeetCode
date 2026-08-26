class Solution {
    public int maxVowels(String s, int k) {

        int c = 0;
        for(int i = 0 ; i<k ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }
        }

        int cmax = c;
        int low = 0;
        for(int high = k ; high<s.length() ; high++){

            if(s.charAt(low)=='a' || s.charAt(low)=='e' || s.charAt(low)=='i' || s.charAt(low)=='o' || s.charAt(low)=='u'){
                c--;
            }
            low++;

            if(s.charAt(high)=='a' || s.charAt(high)=='e' || s.charAt(high)=='i' || s.charAt(high)=='o' || s.charAt(high)=='u'){
                c++;
            }

            cmax = Math.max(cmax,c);

        }
        return cmax;
    }
}