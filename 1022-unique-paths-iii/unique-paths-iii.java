class Solution {

    int rows,cols;
    int result;
    
    public int uniquePathsIII(int[][] grid) {

        rows = grid.length;
        cols = grid[0].length;

        int startRow = 0;
        int startCol = 0;

        int moveable = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                //find
                //1.Starting position
                //count of movable cells
                if(grid[i][j] != -1){
                    moveable++;
                }
                //starting cell
                if(grid[i][j] == 1){
                    startRow = i;
                    startCol = j;
                }
            }
        }
        dfs(grid,startRow,startCol, moveable);
        return result;
        
    }

    private void dfs(int grid[][], int row, int col, int remaining){

        if(row < 0 || col < 0 || row >= rows || col >= cols){
            return;
        }

        if(grid[row][col] == -1){
            return;
        }

        if(grid[row][col] == 2){
            if(remaining == 1){
                result++;
            }
            return;
        }
        int temp = grid[row][col];

        grid[row][col] = -1;

        dfs(grid,row+1,col,remaining-1);
        dfs(grid,row-1,col,remaining-1);
        dfs(grid,row,col+1,remaining-1);
        dfs(grid,row,col-1,remaining-1);

        grid[row][col] = temp;

    }
}