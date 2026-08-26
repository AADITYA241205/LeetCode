class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer,Integer> map = new HashMap<>();

        int low = 0;
        int sum = 0;
        int msum = 0;
        for(int high = 0 ; high<fruits.length ; high++){

            map.put(fruits[high] , map.getOrDefault(fruits[high],0)+1);

            sum+=fruits[high];

            while(map.size()>k){

                map.put(fruits[low] , map.getOrDefault(fruits[low],0)-1);
                sum-=fruits[low];
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }

            if(map.size()==k){
                msum = Math.max(sum)
            }

        }
        
    }
}