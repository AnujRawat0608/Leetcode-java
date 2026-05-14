class Solution {
    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int cols = board[0].length;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){

                //Start the DFS if the first character matches
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    private boolean dfs(char[][] board, String word, int row, int col, int index){

        //base case  - >entire word matched
        if(index == word.length()){
            return true;
        }
        // Invalid conditions
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)){
            return false;
        }

        // Store the current character
        char temp = board[row][col];
        //MArk as visited
        board[row][col] = '#';

        //Explore 4 directions
        boolean found = 
        dfs(board,word,row +1,col, index+1) || //down
        dfs(board,word,row-1,col,index +1) || // up
        dfs(board,word,row, col+1,index+1)||//right
        dfs(board,word,row,col-1,index+1); //left

        //backtrack
        board[row][col] = temp;
        return found;
    }
}