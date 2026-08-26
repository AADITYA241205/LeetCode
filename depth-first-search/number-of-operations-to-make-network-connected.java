class Solution {
    public int makeConnected(int n, int[][] connections) {
        if((n-1)>connections.length) return -1;
        ArrayList<ArrayList<Integer>> adj;
        adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i<connections.length ;i++){
            int src = connections[i][0];
            int dest = connections[i][1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i = 0 ; i<n ; i++){
            if(vis[i]) continue;
            dfs(adj,i,vis);
            count++;
        }
        return count - 1;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj , int a , boolean vis[]){
        if(vis[a]) return;
        vis[a] = true;
        for(int b:adj.get(a)){
            dfs(adj,b,vis);
        }
    }
}