class Solution {
    public int[][] transpose(int[][] matrix) {
        int mat_row = matrix.length;
        int mat_col = matrix[0].length;
        int[][] nums = new int[mat_col][mat_row];

        for(int row = 0; row < mat_row; row++){
            for(int col = 0; col < mat_col; col++){
                nums[col][row] = matrix[row][col];
            }
        }
        return nums;
    }
}