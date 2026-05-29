import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgo {
    class Pair{
    int node;
    int wt;
    Pair(int node, int wt) {
        this.node=node;
        this.wt=wt;
    }
}

class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt - b.wt);
        //{wt,node}
        pq.add(new Pair (0,0));
        boolean[] vis=new boolean[V];
        int sum=0;
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node=curr.node;
            int wt=curr.wt;
            if(vis[node]) continue;
            vis[node]=true;
            sum+=wt;
            for(Pair nei : adj.get(node)) {
                if(!vis[nei.node]) {
                    // vis[nei.node]=true;
                    pq.add(new Pair(nei.node,nei.wt));
                }
            }
        }
        return sum;
    }
}

}
