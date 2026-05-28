import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        dist[src]=0;
        pq.add(new int[]{src,0});
        while(!pq.isEmpty()) {
            int curr[]=pq.poll();
            int currnode=curr[0];
            int currdist=curr[1];
            if(currdist > dist[currnode]) continue;
            for(int elt[]:adj.get(currnode)) {
                int nei=elt[0];
                int d=elt[1];
                if(dist[currnode]+d < dist[nei]) {
                    dist[nei] = dist[currnode]+d;
                    pq.add(new int[]{nei,dist[nei]});
                }             
            }
        }
        return dist;
    }
}
}
