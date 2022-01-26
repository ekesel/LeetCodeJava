class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean visited[][] = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] != '.')
                {
                    visited[i][j] = false;
                }
                else
                    visited[i][j] = true;
            }
        }
        return helper(board, visited);
    }
    public boolean helper(char[][] board, boolean visited[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] != '.' && visited[i][j] == false)
                {
                    visited[i][j] = true;
                    if(isValid(board,i,j, board[i][j]))
                    {
                        if(helper(board,visited))
                            return true;
                        else
                            return false;
                    }
                    else
                        return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col, char c)
    {
        for(int i=0;i<9;i++)
        {
            if(i != col)
            {
                if(board[row][i] == c)
                    return false;
            }
            if(i != row)
            {
                if(board[i][col] == c)
                        return false;
            }
            int x = 3*(row/3)+i/3;
            int y = 3*(col/3)+i%3;
            if(x != row && y != col)
            {
                if(board[x][y] == c)
                    return false;
            }
        }
        return true;
    }
}