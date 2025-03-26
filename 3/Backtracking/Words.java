class Solution { 
    // LC 79
    public boolean wordSearch(char[][] board, String word, int row, int col, int idx)
    {
        if(idx==word.length()) return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(idx)) return false;
        char temp=board[row][col];
        board[row][col]='!';
        boolean found=wordSearch(board,word,row+1,col,idx+1) || wordSearch(board,word,row-1,col,idx+1) || wordSearch(board,word,row,col-1,idx+1) || wordSearch(board,word,row,col+1,idx+1);
        board[row][col]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0) && wordSearch(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
}