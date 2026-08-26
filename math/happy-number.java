class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);

            int a = 0;

            while(n>0){
                int dig = n%10;
                a+=dig*dig;
                n=n/10;
            }

            if(a==1){
                return true;
            }

            n=a;

        }

        return false;
        
    }
}