class Solution {

    public void func(Set set , int[] digits , boolean[] used, int c,int ans){
        if(c==3){
            if(ans%2!=0)return;
            set.add(ans);
            return;
        }

        for(int i = 0 ; i<digits.length ; i++){
            if(used[i])continue;

            if(c==0 && digits[i]==0) {
                continue;
            }
            used[i] = true;
            func(set,digits,used,c+1, ans*10+digits[i]);

            used[i] = false;
        }
        
    }
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        func(set,digits,used,0,0);
        return set.size();    
    }
}