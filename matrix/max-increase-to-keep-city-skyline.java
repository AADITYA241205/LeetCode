class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int[] mr = new int[grid.length];
        int[] mc = new int[grid[0].length];

        for(int i = 0 ; i<grid.length ; i++){
            int max = 0;
            for(int j = 0 ; j<grid[0].length ; j++){
                max = Math.max(max,grid[i][j]);
            }
            mr[i] = max;
        }

        for(int i = 0 ; i<grid.length ; i++){
            int max = 0;
            for(int j = 0 ; j<grid[0].length ; j++){
                max = Math.max(max,grid[j][i]);
            }
            mc[i] = max;
        }

        int sum =0;
        for(int i = 0 ; i<grid.length ; i++){
            int min =0;
            for(int j = 0 ; j<grid[i].length ; j++){
                min = Math.min(mr[i],mc[j]);
                sum = sum + Math.abs(grid[i][j]-min);
            }
        }        
        return sum;
    }
}