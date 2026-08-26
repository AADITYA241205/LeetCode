class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        int[] arr = new int[26];
        for(int i = 0 ; i<allowed.length() ; i++){
            arr[allowed.charAt(i)-'a']++;
        }

        for(int i = 0 ; i<words.length ; i++){
            int count = 0;
            for(int j = 0 ; j<words[i].length() ; j++){
                int k = words[i].charAt(j)-'a' ;
                if(arr[k]!=0){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == words[i].length()){
                ans++;
            }
        }

        return ans;
    }
}