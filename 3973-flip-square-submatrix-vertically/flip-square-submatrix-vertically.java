class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int startRow = x;
        int endRow = x + k - 1;

        int startCol = y;
        int endCol = y + k - 1;

        while (startRow < endRow) {

            for (int col = startCol; col <= endCol; col++) {

                int temp = grid[startRow][col];
                grid[startRow][col] = grid[endRow][col];
                grid[endRow][col] = temp;
            }

            startRow++;
            endRow--;
        }

        return grid;
    }
}