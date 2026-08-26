class Solution {
    public int maximumGap(String skill, String station) {

        int left[] = new int[skill.length()];
        int j = 0;
        for(int i = 0 ; i<station.length() ; i++){
            if(j<skill.length() && skill.charAt(j)==station.charAt(i)){
                left[j] = i;
                j++;
            }
        }
        
        int right[] = new int[skill.length()];
        int k = skill.length()-1;
        for(int i = station.length()-1 ; i>=0 ; i--){
            if(k>=0 && skill.charAt(k)==station.charAt(i)){
                right[k] = i;
                k--;
            }
        }

        int ans = 0;
        for(int i = 0 ; i<skill.length() - 1 ; i++){
            ans = Math.max(ans, right[i + 1] - left[i]);
        }

        return ans;
    }
}