import java.util.ArrayList;
class Solution {
    public void dfss(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list, boolean[] vis) {
        vis[node]=true;
        list.add(node);
        for(int elt : adj.get(node)) {
            if(!vis[elt]) {
                vis[elt]=true;
                dfss(elt,adj,list,vis);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        dfss(0,adj,list,vis);
        return list;
    }
}