class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end = m*n - 1;
        // We are applying binary search in this question
        while(st<=end){
            int mid = st + (end - st)/2;
            // For finding the row of the mid
            int r = mid/n;
            //For finding the column of the mid
            int c = mid % n;
            if(target == matrix[r][c]){
                return true;
            }
            else if(target>matrix[r][c]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return false;
        
    }
}