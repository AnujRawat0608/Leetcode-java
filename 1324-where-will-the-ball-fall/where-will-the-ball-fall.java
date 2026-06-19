class Solution {
    public int[] findBall(int[][] grid) {

        int m = grid.length;      // rows
        int n = grid[0].length;   // columns

        int[] result = new int[n];

        for (int ball = 0; ball < n; ball++) {

            int row = 0;
            int col = ball;
            boolean reached = true;

            while (row < m) {

                if (grid[row][col] == 1) {

                    if (col == n - 1 || grid[row][col + 1] == -1) {
                        reached = false;
                        break;
                    }

                    col++;

                } else { // grid[row][col] == -1

                    if (col == 0 || grid[row][col - 1] == 1) {
                        reached = false;
                        break;
                    }

                    col--;
                }

                row++;
            }

            result[ball] = reached ? col : -1;
        }

        return result;
    }
}
/*
2d grid  of m * n represnts a box
 n balls 
box is open on the top and bottom 



*/