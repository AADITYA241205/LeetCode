class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i<=rowIndex ; i++){
            List<Integer> ls = new ArrayList<>();
            ls.add(1);

            for(int j = 1 ; j<i ; j++){
                ls.add(ans.get(j-1)+ans.get(j));
            }

            if(i>0)ls.add(1);
            ans = ls;
        }
        
        return ans;
    }
}