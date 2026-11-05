class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        for(int i = 0 ; i<rowShift.length ; i++){
            int a = rowShift[i];

            while(a!=0){
                int b = grid[i][0];
                for(int j = 0 ;j<n-1 ; j++){
                    grid[i][j] = grid[i][j+1];
                }
                grid[i][n-1] = b;
                a--;
            }
        }

        for(int i = 0 ; i<colShift.length ; i++){
            int a = colShift[i];

            while(a!=0){
                int b = grid[0][i];
                for(int j = 0 ; j<n-1 ; j++){
                    grid[j][i] = grid[j+1][i];
                }
                grid[n-1][i]=b;
                a--;
            }
        }

        return grid;
        
    }
}