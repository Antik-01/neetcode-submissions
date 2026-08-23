class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl = 0, rh = matrix.length-1;
        int cl = 0, ch = matrix[0].length-1;
        while(rl <= rh){
            int rm = rl + (rh-rl)/2;
            if(matrix[rm][cl] <= target && matrix[rm][ch] >= target){
                while(cl<=ch){
                    int cm = cl + (ch-cl)/2;
                    if(matrix[rm][cm] == target) return true;
                    if(matrix[rm][cm] < target) cl = cm+1;
                    else ch = cm-1;
                }
            }
            else if(matrix[rm][cl] > target) rh = rm-1;
            else rl = rm+1;
        }
        return false;
    }
}
