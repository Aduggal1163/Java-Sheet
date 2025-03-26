class Solution {
    static void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
        vis[i]=true;
        for(int ele : adj.get(i))
        {
            if(!vis[ele]) dfs(ele, vis, adj,ans);
        }
        ans.add(i);
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=adj.size();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                 dfs(i,vis,adj,ans);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
    //this ques is in geeks for geeks