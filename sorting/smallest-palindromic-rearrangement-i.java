class Solution {
    public String smallestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        StringBuilder str = new StringBuilder();

        int arr[] = new int[26];
        for (int i = 0; i < ((s.length()) / 2); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                while (arr[i] != 0) {
                    str.append((char) (i + 'a'));
                    arr[i]--;
                }
            }
        }
        StringBuilder ans = new StringBuilder(str);
        if (s.length() % 2 != 0) {
            ans.append(s.charAt(s.length() / 2));
        }
        str.reverse();

        ans.append(str);
        return ans.toString();
    }
}