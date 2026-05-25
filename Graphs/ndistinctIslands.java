import java.util.HashSet;

public class ndistinctIslands {
    // User function Template for Java

class Solution {
    String s = "";
    void dfs(int i, int j, boolean[][] vis, int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=true;
        if(i-1>=0&& !vis[i-1][j] && grid[i-1][j]==1) {
            s+="U";
            dfs(i-1,j,vis,grid);
        }
        if(j+1<n && !vis[i][j+1] && grid[i][j+1]==1) {
            s+="D";
            dfs(i,j+1,vis,grid);
        }
        if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1) {
            s+="L";
            dfs(i,j-1,vis,grid);
        }
        if(i+1<m && !vis[i+1][j] && grid[i+1][j]==1) {
            s+="R";
            dfs(i+1,j,vis,grid);
        }
        s+="B";
    }
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!vis[i][j] && grid[i][j]==1) {
                    dfs(i,j,vis,grid);
                    set.add(s);
                    s="";
                }
            }
        }
        return set.size();   
    }
}

}
