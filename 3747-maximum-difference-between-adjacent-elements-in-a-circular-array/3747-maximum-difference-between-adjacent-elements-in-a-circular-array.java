class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxSum = -1;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int diff = Math.abs(nums[i]-nums[i+1]);
            if(diff > maxSum){
                maxSum = diff;
            }
        }
        int circularDiff = Math.abs(nums[n-1]-nums[0]);
        if(maxSum<circularDiff) maxSum = circularDiff;
        return maxSum;
    }
}