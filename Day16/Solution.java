class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int row = matrix.length, col = matrix[0].length;
        
        int i = 0, j = col-1;
        
        while(i >= 0 && i < row && j >= 0 && j < col)
        {
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}