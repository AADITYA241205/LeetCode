class Solution {
    public int maximumLengthSubstring(String s) {

        int[] arr = new int[26];
        int j = 0;
        int max  = 0;

        for(int i = 0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;

            while(arr[s.charAt(i)-'a']>2){
                arr[s.charAt(j)-'a']--;
                j++;
            }
            max = Math.max(max,i-j+1);

        }
        return max;
    }
}