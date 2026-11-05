class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);

        return ans;
    }

    void backtrack(List<String> ans, StringBuilder str,int o, int c, int n) {
    
        if(str.length() == 2*n){
            ans.add(str.toString());
            return;
        }

        if(o<n){
            str.append('(');
            backtrack(ans, str, o+1, c, n);
            str.deleteCharAt(str.length() - 1);
        }

        if(c<o){
            str.append(')');
            backtrack(ans, str, o, c+ 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}