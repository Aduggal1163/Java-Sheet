import java.util.*;
class Solution {
    public boolean dfs(int node, boolean[] vis, boolean[] pathvis, List<List<Integer>> adj) {
        vis[node]=true;
        pathvis[node]=true;
        for(int nei : adj.get(node)) {
            if(!vis[nei]){
                if(!dfs(nei,vis,pathvis,adj)) return false;
            }
            else if(pathvis[nei] == true) return false;
        }
        pathvis[node]=false;
        return true;
    }
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int p [] : pre) {
            int u = p[0];
            int v = p[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[n];
        boolean[] pathvis=new boolean[n];
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                if(!dfs(i,vis,pathvis,adj)) return false;
            }
        }
        return true;
    }
}