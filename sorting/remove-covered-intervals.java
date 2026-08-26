class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0 ; i<intervals.length ; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            boolean flag = false;
            for(int j = 0 ; j<intervals.length ; j++){
                if(j==i) continue;
                if(a>=intervals[j][0] && b<=intervals[j][1]){
                    flag = true;
                    break;
                }
            }
            if(flag) count++;
        }

        return intervals.length - count;
    }
}