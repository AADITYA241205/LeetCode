class Solution {
    public int minimumPushes(String word) {
        int ans = 0;

        if (word.length() - 8 > 0) {
            ans += 8;
        } else {
            return word.length();
        }

        if (word.length() - 16 > 0) {
            ans += 8 * 2;
        } else {
            return ans + (word.length() - 8) * 2;
        }

        if (word.length() - 24 > 0) {
            ans += 8 * 3;
        } else {
            return ans + (word.length() - 16) * 3;
        }

        return ans + (word.length() - 24) * 4;
    }
}