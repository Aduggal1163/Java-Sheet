import java.util.ArrayList;
import java.util.List;

public class Bipartite {
    class Solution {

    public boolean dfs(int node, boolean[] vis, int[] color, List<List<Integer>> adj, int rang) {
        vis[node]=true;
        color[node]=rang;
        for(int elt : adj.get(node)) {
            if(!vis[elt]) {
                int nextrang = (rang==1) ? 2 : 1;
                if(!dfs(elt,vis,color,adj,nextrang)) return false;
            }
            else if(color[elt] == rang) return false;
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++) adj.add(new ArrayList<>());
        for(int i=0;i<v;i++) {
            for(int edge : graph[i]) adj.get(i).add(edge);
        }
        boolean[] vis=new boolean[v];
        int[] color = new int[v];
        for(int i=0;i<v;i++) {
            if(!vis[i]) {
                if(!dfs(i,vis,color,adj,1)) return false;
            }
        }
        return true;
    }
}
}
