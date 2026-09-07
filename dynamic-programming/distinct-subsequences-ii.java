class Solution {
    HashSet<String> set = new HashSet<>();
    public void sub(String s , int i , String str){
        if (i == s.length()) {
            set.add(str);
            return;
        }
        sub(s, i+1, str+s.charAt(i));

        sub(s, i+1, str);

    }
    public int distinctSubseqII(String s) {
        sub(s,0,"");;

        return set.size()-1;
    }
}