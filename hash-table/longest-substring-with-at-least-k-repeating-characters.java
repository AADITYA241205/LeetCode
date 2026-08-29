class Solution {
    public int longestSubstring(String s, int k) {

        int ans = 0;

        for(int i = 1 ; i<=26 ; i++){

            int[] arr = new int[26];

            int low = 0;
            int unq = 0;
            int count = 0;


            for(int high = 0 ; high<s.length() ; high++){
                
                if(arr[s.charAt(high)-'a']==0){
                    unq++;
                }

                arr[s.charAt(high)-'a']++;

                if(arr[s.charAt(high)-'a']==k){
                    count++;
                }

                while(unq>i){
                    
                    if(arr[s.charAt(low)-'a']==k){
                        count--;
                    }

                    arr[s.charAt(low)-'a']--;

                    if(arr[s.charAt(low)-'a']==0){
                        unq--;
                    }

                    low++;
                }

                if(unq==i && count==i){
                    ans = Math.max(ans,high-low+1);
                }

            }

        }
        
        return ans;
    }
}