class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int sum = 0 ;
        int maxsum = 0;

        for(int i = 0 ; i<customers.length ; i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int low = 0;
        for(int high = 0 ; high<minutes ; high++){
            if(grumpy[high]==1){
                sum+=customers[high];
            }
        }

        maxsum = sum;

        for(int high = minutes ; high<customers.length ; high++){

            if(grumpy[low]==1){
                sum-=customers[low];
            }

            if(grumpy[high]==1){
                sum+=customers[high];
            }
            
            low++;
            maxsum = Math.max(sum,maxsum);
        }
        
        return maxsum;
    }
}