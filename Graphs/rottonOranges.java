import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int row;
    int col;
    int time;
    Pair(int row, int col, int time) {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int totaltime=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,1,0,-1};
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int row=curr.row;
            int col=curr.col;
            int time=curr.time;
            totaltime=Math.max(totaltime,time);
            for(int i=0;i<4;i++) {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=true;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]==1 && !vis[i][j]) return -1;
            }
        }
        return totaltime;
    }
}