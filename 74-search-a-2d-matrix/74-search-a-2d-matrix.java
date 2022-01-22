class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        int low = 0 ;
        int high = (row * column) - 1;
        
        while(low<=high)
        {
            int mid = (low + (high - low)/2);
            if(matrix[mid/column][mid%column] == target)    //[mid/column] to get row and [mid/column] to get column indices without using extra space
                return true;
            if(matrix[mid/column][mid%column] < target)      //means that target value lies ahead and modify the low value
                low = mid + 1;
            else
                high = mid - 1;      //means that target value lies behind and modify the high value
        }
        return false;
    }
}