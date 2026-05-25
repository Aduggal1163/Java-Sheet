import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
         boolean[] vis = new boolean[adj.size()];
         Queue<Integer> q = new LinkedList<>();
         q.add(0);
         vis[0]=true;
         while(!q.isEmpty()) {
             int val = q.poll();
             list.add(val);
             vis[val]=true;
             for(int elt : adj.get(val)) {
                 if(!vis[elt]) {
                     vis[elt]=true;
                     q.add(elt);
                 }
             }
         }
         return list;
    }
}
