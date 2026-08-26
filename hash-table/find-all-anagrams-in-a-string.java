class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] par = new int[26];
        int[] sar = new int[26];
        for (int i = 0; i < p.length(); i++) {
            par[p.charAt(i) - 'a']++;
            sar[s.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (par[i] != sar[i]) {
                flag = false;
            }
        }
        if (flag)
            ans.add(0);

        int low = 0;
        for (int high = p.length(); high < s.length(); high++) {

            sar[s.charAt(low) - 'a']--;
            sar[s.charAt(high) - 'a']++;
            low++;

            flag = true;

            for (int i = 0; i < 26; i++) {
                if (par[i] != sar[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                ans.add(low);

        }
        return ans;
    }
}