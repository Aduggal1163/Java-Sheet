import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    class Solution {
    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> list, Stack<Integer> st) {
        vis[node]=true;
        for(int nei : list.get(node)) {
            if(!vis[nei]) {
                vis[nei] = true;
                dfs(nei,vis,list,st);
            }
        }
        st.push(node);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++) list.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
        }
        Stack<Integer> st=new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                dfs(i,vis,list,st);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!st.isEmpty()) {
            res.add(st.pop());
        }
        return res;
    }
}
}
