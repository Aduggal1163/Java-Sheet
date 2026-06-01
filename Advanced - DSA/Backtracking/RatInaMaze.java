// A Maze is given as N*N binary matrix of blocks. A rat starts from source and has to reach the destination.

// The rat can move only in two directions, i.e. rightwards and downwards.

// In the maze matrix, -1 means the block is a dead end and 0 means the block can be used in the path from source to destination.

// Note: Source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]

// Your task is to find the number of possible solutions for the rat to reach the destination.

// Input Format

// First line contains number of rows i.e. N
// Next N lines contains N binary numbers each denoting the maze
// Constraints

// 2 <= N <= 15
// Output Format

// Print the number of solutions
// Sample Input

// 4
//  0 -1 -1 -1
//  0  0 -1 -1
// -1  0  0 -1
// -1  0  0  0
// Sample Output

// 2
// Explanation:

// Solution 1: From cell (0,0) -> down -> (1,0) -> forward -> (1,1) -> down -> (2,1) -> down -> (3,1) -> forward -> (3,2) -> forward -> (3,3)
// Solution 2: From cell (0,0) -> down -> (1,0) -> forward -> (1,1) -> down -> (2,1) -> forward -> (2,2) -> down -> (3,2) -> forward -> (3,3)
// Total 2 solutions possible for this maze.
class Result {
    public static int solve(int[][] maze, int n, int i, int j)
    {
        if(i==n-1 && j==n-1 && maze[i][j]==0) return 1;
        if(i>n || j>n || maze[i][j]==-1)return 0;
        return solve(maze,n,i+1,j)+solve(maze,n,i,j+1);
    }
  public static int solveMaze(int maze[][], int size) {
    // Write your code here
        if(maze[0][0]==-1) return -1;
          return solve(maze,size,0,0);
  }
}