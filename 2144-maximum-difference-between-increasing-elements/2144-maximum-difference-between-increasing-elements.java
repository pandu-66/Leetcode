class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDiff = -1;
        int minVal = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<minVal){
                minVal = nums[i];
            }else if(nums[i]-minVal > maxDiff && nums[i]>minVal){
                maxDiff = nums[i]-minVal;
            }
        }
        return maxDiff;
    }
}