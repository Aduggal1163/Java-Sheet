import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//strongly connected components
public class kasaraju {
    class Solution {
    // Function to find number of strongly connected components in the graph
    public static void dfs(int node, boolean[] vis, Stack<Integer> st, List<List<Integer>> adj) {
        vis[node]=true;
        for(int nei : adj.get(node)) {
            if(!vis[nei]) dfs(nei,vis,st,adj);
        }
        st.push(node);
    }
    public static void dfs2(int node, boolean[] vis, List<List<Integer>> adj) {
        vis[node]=true;
        for(int nei : adj.get(node)) {
            if(!vis[nei]) dfs2(nei,vis,adj);
        }
    }
    public int kosaraju(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                dfs(i,vis,st,adj);
            }
        }
        List<List<Integer>> adj2=new ArrayList<>();
        for(int i=0;i<V;i++) {
            adj2.add(new ArrayList<>());
        }
        boolean[] vis2=new boolean[V];
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj2.get(v).add(u);
        }
        int scc=0;
        while(!st.isEmpty()) {
            int curr = st.pop();
            if(!vis2[curr]) {
                vis2[curr]=true;
                scc++;
                dfs2(curr,vis2,adj2);
            }
        }
        return scc;
    }
}
}
