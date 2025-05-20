class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int foundIdx = -1;

        for(int i=0;i<m;i++){
            if(target >= matrix[i][0] && target<=matrix[i][n-1]){
                foundIdx = i;
                break;
            }
        }
        if(foundIdx>=0){
            int left = 0;
            int right = n;
            while(left<=right){
                int mid = (left+right)/2;
                if(matrix[foundIdx][mid]==target){
                    return true;
                }else if(matrix[foundIdx][mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}