class Solution {
    public int totalFruit(int[] fruits) {

        if(fruits.length<3)return fruits.length;

        Map<Integer,Integer> map = new HashMap<>();

        int low = 0;
        int sum = 0;
        int msum = 0;
        for(int high = 0 ; high<fruits.length ; high++){

            map.put(fruits[high] , map.getOrDefault(fruits[high],0)+1);


            while(map.size()>2){

                map.put(fruits[low] , map.getOrDefault(fruits[low],0)-1);
                
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }

            // if(map.size()==2){
                msum = Math.max(msum , high-low+1);
            // }

        }

        return msum;
        
    }
}