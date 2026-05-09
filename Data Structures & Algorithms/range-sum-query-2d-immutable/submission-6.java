class NumMatrix {
    int[][] prefMatrix;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        prefMatrix = new int[n][m];
        prefMatrix[0][0] = matrix[0][0];

        for(int i=1; i<n; i++){
            // prefMatrix[0][i] = prefMatrix[0][i-1] + matrix[0][i];
            prefMatrix[i][0] = prefMatrix[i-1][0] + matrix[i][0];
        }
        for(int i=1; i<m; i++){
            prefMatrix[0][i] = prefMatrix[0][i-1] + matrix[0][i];
            // prefMatrix[i][0] = prefMatrix[i-1][0] + matrix[i][0];
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                prefMatrix[i][j] = matrix[i][j] + prefMatrix[i][j-1] + prefMatrix[i-1][j] - prefMatrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        if(row1 == 0 && col1 == 0) return prefMatrix[row2][col2];
        if(row1 == 0) return prefMatrix[row2][col2] - prefMatrix[row2][col1-1];
        if(col1 == 0) return prefMatrix[row2][col2] - prefMatrix[row1-1][col2]; 
        return prefMatrix[row2][col2] - prefMatrix[row2][col1-1] 
                - prefMatrix[row1-1][col2] + prefMatrix[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */