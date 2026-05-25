public class nIslands {
    class Solution {
    
    private void dfs(int i, int j, boolean[][] vis, char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=true;
        if(i-1>=0&& !vis[i-1][j] && grid[i-1][j]=='1') dfs(i-1,j,vis,grid);
        if(j+1<n && !vis[i][j+1] && grid[i][j+1]=='1') dfs(i,j+1,vis,grid);
        if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]=='1') dfs(i,j-1,vis,grid);
        if(i+1<m && !vis[i+1][j] && grid[i+1][j]=='1') dfs(i+1,j,vis,grid);
    }

    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int cnt=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!vis[i][j] && grid[i][j]=='1') {
                    dfs(i,j,vis,grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
}
