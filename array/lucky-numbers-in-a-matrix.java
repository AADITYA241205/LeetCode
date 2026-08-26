class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int b = 0;
        for(int i = 0 ; i<matrix.length ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    b = j;
                }    
            }
        
            int max = min;
            for(int j = 0 ; j<matrix.length ; j++){
                if(max<matrix[j][b]){
                    max = matrix[j][b];
                }    
            }
            if(max==min){
                ans.add(max);
            }

        }
        return ans;   
    }
}