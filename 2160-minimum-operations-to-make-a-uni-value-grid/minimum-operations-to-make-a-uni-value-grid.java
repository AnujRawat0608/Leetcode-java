class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] flat = new int[m*n];

        int idx = 0;

        int rem = grid[0][0] % x;
        for(int[] row : grid){
            for(int val : row){
                if(val % x != rem) return -1;
                flat[idx++] = val;
            }
        }

        Arrays.sort(flat);
        int median = flat[flat.length/2];

        int ops = 0; 
        for(int val : flat){
            ops += Math.abs(val - median) /x;
        }
        return ops;

       
    }
}