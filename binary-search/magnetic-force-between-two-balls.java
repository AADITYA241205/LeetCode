class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1];

        while(low<=high){
            int mid = low + (high - low)/2;
            
            if(check(position , mid , m)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return high;
    }

    boolean check(int[] position , int mid , int m){
        int a  = 0;
        int c = 1;

        for(int i = 1 ; i<position.length ; i++){
            if(position[i]-position[a]>=mid){
                a = i;
                c++;
            }
        }
        return c<m;

    }
}