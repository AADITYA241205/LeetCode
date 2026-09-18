class Solution {
    public int maxFreqSum(String s) {

        int[] arr = new int[26];

        int maxv = 0;
        int maxc = 0;

        for(int i = 0 ;i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i = 0 ; i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                maxv = Math.max(maxv,arr[i]);
            }
            else{
                maxc = Math.max(maxc,arr[i]);
            }
        }
        
        return maxv+maxc;
    }
}