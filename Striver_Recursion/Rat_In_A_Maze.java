// Rat in a Maze Problem - I
// Difficulty: MediumAccuracy: 35.75%Submissions: 321K+Points: 4Average Time: 25m
// Consider a rat placed at position (0, 0) in an n x n square matrix mat. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).

// The matrix contains only two possible values:

// 0: A blocked cell through which the rat cannot travel.
// 1: A free cell that the rat can pass through.
// Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell. In case of no path, return an empty list.+

// The task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.

// Return the final result vector in lexicographically smallest order.

// Examples:

// Input: mat[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
// Output: ["DDRDRR", "DRDDRR"]
// Explanation: The rat can reach the destination at (3, 3) from (0, 0) by two paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR.
// Input: mat[][] = [[1, 0], [1, 0]]
// Output: []
// Explanation: No path exists and the destination cell is blocked.
// Input: mat = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
// Output: ["DDRR", "RRDD"]
// Explanation: The rat has two possible paths to reach the destination: 1. "DDRR" 2. "RRDD", These are returned in lexicographically sorted order.

class Solution {
    // Function to find all possible paths
    public void solve(int i, int j, ArrayList<String> ans, ArrayList<ArrayList<Integer>> mat, boolean[][] vis, String s)
    {
        int n=mat.size();
        if(i==n-1 && j==n-1)
        {
            ans.add(s);
            return;
        }
        //downwardss
        if(i+1<n && !vis[i+1][j] && mat.get(i+1).get(j)==1)
        {
            vis[i][j]=true;
            solve(i+1,j,ans,mat,vis,s+"D");
            vis[i][j]=false;
        }
        // leftwardss
        if(j-1>=0 &&! vis[i][j-1] && mat.get(i).get(j-1)==1)
        {
            vis[i][j]=true;
            solve(i,j-1,ans,mat,vis,s+"L");
            vis[i][j]=false;
        }
        //rightwards
        if(j+1<n &&! vis[i][j+1] && mat.get(i).get(j+1)==1)
        {
            vis[i][j]=true;
            solve(i,j+1,ans,mat,vis,s+"R");
            vis[i][j]=false;
        }
        //upwardssss
        if(i-1>=0 && !vis[i-1][j] && mat.get(i-1).get(j)==1)
        {
            vis[i][j]=true;
            solve(i-1,j,ans,mat,vis,s+"U");
            vis[i][j]=false;
        }
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        int n=mat.size();
        if (n == 0 || mat.get(0).get(0) == 0 || mat.get(n - 1).get(n - 1) == 0) return ans;
        boolean[][] vis = new boolean[n][n];
        vis[0][0] = true;
        solve(0,0,ans,mat,vis,"");
        return ans;
    }
}