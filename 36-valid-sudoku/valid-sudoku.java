import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create 3 arrays of sets: one for rows, one for columns, one for boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];

                if (current == '.') continue; // skip empty cells

                // Check row
                if (rows[row].contains(current)) {
                    return false;
                }
                rows[row].add(current);

                // Check column
                if (columns[col].contains(current)) {
                    return false;
                }
                columns[col].add(current);

                // Check 3x3 box
                int boxIndex = (row / 3) * 3 + (col / 3);
                if (boxes[boxIndex].contains(current)) {
                    return false;
                }
                boxes[boxIndex].add(current);
            }
        }
        return true;
    }
}
