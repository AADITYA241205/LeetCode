class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[(grid.length)*(grid[0].length)];
        k = k % ((grid.length)*(grid[0].length));
        int a = 0;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                arr[a] = grid[i][j];
                a++;
            }
        }

        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        int b = 0;
        for(int i = 0 ; i<grid.length ; i++){
            List<Integer> ansr = new ArrayList<>();
            for(int j = 0 ; j < grid[i].length ; j++){
                ansr.add(arr[b]);
                b++;
            }
            ans.add(ansr);
        }
        
        return ans;
        
    }

    public void reverse(int[] arr , int i , int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

    }
}