import java.util.ArrayList;
import java.util.List;

public class DetechCycleD {
    //dfs
    class Solution {
    
    public boolean dfs(int node, int parent, List<List<Integer>> adj, boolean[] vis,boolean[] pathvis) {
        vis[node]=true;
        pathvis[node]=true;
        for(int nei : adj.get(node)) {
            if(!vis[nei]) {
                if(dfs(nei,node,adj,vis,pathvis)) return true;
            }
            else if(pathvis[nei]) return true;
        }
        pathvis[node]=false;
        return false;
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[V];
        boolean[] pathvis=new boolean[V];
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                if(dfs(i,-1,adj,vis,pathvis)) return true;
            }
        }
        return false;
    }
}
}


