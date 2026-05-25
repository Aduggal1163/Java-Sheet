import java.util.*;
// BFS
class Pair {
    int node;
    int parent;
    Pair(int node, int parent) {
        this.node=node;
        this.parent=parent;
    }
}

class Solution {
        // Code here
    public boolean isValid(int src, List<List<Integer>> adj, boolean[] vis) {
        vis[src]=true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int node=curr.node;
            int parent=curr.parent;
            for(int nei : adj.get(node)) {
                if(!vis[nei]) {
                    vis[nei]=true;
                    q.add(new Pair(nei,node));
                } else if (nei != parent) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                if(isValid(i,adj,vis)) return true;
            }
        }
        return false;
    }
}

//DFS
class Solution2 {
        // Code here
    public boolean dfs(int node, int parent, List<List<Integer>> adj, boolean[] vis) {
        vis[node]=true;
            for(int nei : adj.get(node)) {
                if(!vis[nei]) {
                    vis[nei]=true;
                    if(dfs(nei,node,adj,vis)) {
                        return true;
                    }
                } else if (nei != parent) {
                    return true;
                }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                if(dfs(i,-1,adj,vis)) return true;
            }
        }
        return false;
    }
}