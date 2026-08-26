class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Character> pat = new HashMap<>();
            HashMap<Character, Character> wor = new HashMap<>();
            boolean flag = true;
            for (int j = 0; j < pattern.length(); j++) {
                char wch = words[i].charAt(j);
                char pch = pattern.charAt(j);
                if (pat.containsKey(pch)) {
                    if (wch != pat.get(pch)) {
                        flag = false;
                        break;
                    }
                } else {
                    pat.put(pch, wch);
                }
                if (wor.containsKey(wch)) {
                    if (wor.get(wch) != pch) {
                        flag = false;
                        break;
                    }
                } else {
                    wor.put(wch, pch);
                }
            }
            if (flag) {
                ans.add(words[i]);
            }
        }
        return ans;
    }
}