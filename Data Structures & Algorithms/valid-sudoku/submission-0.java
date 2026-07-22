class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;

                if (!set.add(board[i][j]))
                    return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (board[i][j] == '.')
                    continue;

                if (!set.add(board[i][j]))
                    return false;
            }
        }

        // Check 3x3 boxes
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {

            for (int colStart = 0; colStart < 9; colStart += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int row = rowStart; row < rowStart + 3; row++) {

                    for (int col = colStart; col < colStart + 3; col++) {

                        if (board[row][col] == '.')
                            continue;

                        if (!set.add(board[row][col]))
                            return false;
                    }
                }
            }
        }

        return true;
    }
}