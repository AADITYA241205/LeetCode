class Solution {
    public int nearestDrone(int[][] drones, int[] target) {

        int min = Integer.MAX_VALUE;
        int idx = 0;

        for(int i = 0 ; i<drones.length ; i++){

            int a = Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]);

            if(a<=drones[i][2]){
                if(min>a){
                  idx = i;  
                min = a;    
                }
            }
            
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return idx;
    }
}