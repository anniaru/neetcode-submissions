class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix[0].length;
        int numRows = matrix.length;

        int rowL = 0;
        int rowR = matrix.length - 1;
        int[] search = new int[rowLength];
        while (rowL <= rowR){
            int midRow = rowL + (rowR - rowL) / 2;
            if (target >= matrix[midRow][0] && target <= matrix[midRow][rowLength - 1]){
                search = matrix[midRow];
                break;
            }
            else if (target > matrix[midRow][rowLength - 1]){
                rowL = midRow + 1;
            }
            else if (target < matrix[midRow][0]){
                rowR = midRow - 1;
            }
        }

        if (rowL > rowR){
            return false;
        }

        int left = 0;
        int right = search.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;

            if (target == search[mid]){
                return true;
            }
            else if (target > search[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
