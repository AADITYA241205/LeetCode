class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for(int i = left ; i<=right ; i++){
            int a = i;
            boolean flag = true;
            while(a>0){
                int b = a%10;
                if(b==0){
                    flag = false;
                    break;
                }
                else if(i%b!=0){
                    flag = false;
                    break;
                }
                a=a/10;
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}