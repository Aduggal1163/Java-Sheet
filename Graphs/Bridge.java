import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bridge {
    class Solution {
    private int timer = 1;
    public void dfs(int node, int parent, boolean[] vis, int time[], int low[], List<List<Integer>> adj, List<List<Integer>> bridges) {
        vis[node]=true;
        time[node]=low[node]=timer;
        timer++;
        for(int nei : adj.get(node)) {
            if(nei == parent) continue;
            if(!vis[nei]) {
                dfs(nei,node,vis,time,low,adj,bridges);
                low[node] = Math.min(low[node],low[nei]);
                //is it a bridge or not
                if(low[nei] > time[node]) {
                    bridges.add(Arrays.asList(nei,node));
                }
            }
            else {
                low[node] = Math.min(low[node],low[nei]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[n];
        int time[]=new int[n];
        int low[]=new int[n];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0,-1,vis,time,low,adj,bridges);
        return bridges;
    }
}
}
