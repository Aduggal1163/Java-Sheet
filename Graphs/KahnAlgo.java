import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
public class KahnAlgo {
    class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        Queue<Integer> q=new LinkedList<>();
        int indegree[]=new int[V];
        for(int i=0;i<V;i++) {
            for(int nei : adj.get(i)) {
                indegree[nei]++;
            }
        }
        for(int i=0;i<V;i++) {
            if(indegree[i] == 0) q.add(i);
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(q.size()>0) {
            int curr = q.poll();
            topo.add(curr);
            for(int nei : adj.get(curr)) {
                indegree[nei]--;
                if(indegree[nei] == 0) {
                    q.add(nei);
                }
            }
        }
        return topo;
    }
}
}

class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[V];
        for(int i=0;i<V;i++) {
            for(int nei : adj.get(i)) {
                indegree[nei] ++;
            }
        }
        for(int i=0;i<V;i++) if(indegree[i] == 0) q.add(i);
        List<Integer> kahn = new ArrayList<>();
        int cnt = 0;
        while(!q.isEmpty()) {
            int curr = q.poll();
            kahn.add(curr);
            cnt++;
            for(int nei : adj.get(curr)) {
                indegree[nei] --;
                if(indegree[nei] == 0) q.add(nei);
            }
        }
        return V != cnt;
    }
}
