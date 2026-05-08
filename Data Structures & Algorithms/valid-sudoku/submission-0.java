class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for(int i=0; i<9; i++){
            Set<Character> setRow = new HashSet<>();
            Set<Character> setCol = new HashSet<>();
            Set<Character> box = new HashSet<>();
            for(int j=0; j<9; j++){
                int idx = (i/3)*3+(j/3);
                if(board[i][j] != '.'){
                    if(setCol.contains(board[i][j])) return false;
                    setCol.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(setRow.contains(board[j][i])) return false;
                    setRow.add(board[j][i]);
                } 
                int row = (i/3)*3 + j/3;
                int col = (i%3)*3 + (j%3);
                if(board[row][col] != '.'){
                    if(box.contains(board[row][col])) return false;
                    box.add(board[row][col]);
                }          
            }
        }
        return true;
    }
}
