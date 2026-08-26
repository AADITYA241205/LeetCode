class Solution {
    public int findCircleNum(int[][] isConnected){
        ArrayList<ArrayList<Integer>> adj;
        adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i<isConnected.length;i++){
            for(int j = 0 ; j<isConnected.length ; j++){
            if(isConnected[i][j]==0) continue;
            adj.get(i).add(j);
            adj.get(j).add(i);
            }
        }
        int count = 0;
        boolean[] vis = new boolean[isConnected.length];
        for(int i = 0 ; i<isConnected.length ; i++){
            if(vis[i]) continue;
            dfs(adj,i,vis);
            count++;
        }
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj , int a , boolean vis[]){
        if(vis[a]) return;
        vis[a] = true;
        for(int b:adj.get(a)){
            dfs(adj,b,vis);
        }
    }
}