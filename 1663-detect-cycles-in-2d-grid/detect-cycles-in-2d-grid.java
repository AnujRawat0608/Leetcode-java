class Solution {
        private int m, n;
    private boolean[][] visited;
    private int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    
    public boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, i, j, -1, -1, grid[i][j])) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }


        private boolean dfs(char[][]grid, int row, int col, int parentRow, int parentCol, char ch ){
            visited[row][col] = true;

            for(int[] dir : dirs){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n)continue;
                if(grid[newRow][newCol] != ch)continue;

                if(newRow == parentRow && newCol == parentCol)continue;

                if(visited[newRow][newCol])return true;

                if(dfs(grid,newRow,newCol,row,col,ch))return true;
            }
            return false;
        }
}