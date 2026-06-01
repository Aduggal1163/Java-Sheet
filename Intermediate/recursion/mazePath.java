public class mazePath {
    public static int maze(int row, int col, int m, int n)
    {
        if(row==m || col==n) return 1;
        int rightWay=maze(row, col+1, m, n);
        int downWaysss=maze(row+1,col, m, n);
        return rightWay+downWaysss;
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(maze(1,1,m,n));
    }
}
