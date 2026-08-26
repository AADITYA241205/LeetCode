class Solution {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Character> ans1 = new ArrayList<>();
        ArrayList<Character> ans2 = new ArrayList<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!ans1.contains(ch1)){
                if(!ans2.contains(ch2)){
                    ans1.add(ch1);
                    ans2.add(ch2);
                }
                else{
                    return false;
                }
                
            }
            else{
                int a = ans1.indexOf(ch1);
                int b = ans2.indexOf(ch2);
                if(a!=b) return false;
            }
        }

        return true;
    }
}