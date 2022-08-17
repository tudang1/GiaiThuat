public class _36_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        int rowMax,columnMax;
        for (int x =0; x <9;x++){
            for (int y = 0;y<9;y++){
                if (board[x][y] != '.'){
                    // hàng
                    for (int k = y+1; k< 9; k++ ){
                        if (board[x][y] == board[x][k]) {
                            return false;
                        }
                    }
                    // cột
                    for (int k = x+1; k< 9; k++ ){
                        if (board[x][y] == board[k][y]) {
                            return false;
                        }
                    }
                    // box
                    rowMax = ((x / 3) * 3) + 2;
                    columnMax = ((y / 3) * 3) + 2;
                    for (int k = rowMax; k >= rowMax - 2; k--) {
                        for (int l = columnMax; l >= columnMax - 2; l--) {
                            if (x != k && y != l && board[x][y]==board[k][l]){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
