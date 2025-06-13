class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = nums[n-1]-nums[0];
        while(low<high){
            int mid = (low+high)/2;
            if(canMakePairs(mid, n, nums, p)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static boolean canMakePairs(int x, int n, int nums[], int p){
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]-nums[i] <= x){
                count++;
                i++;
            }
        }
        return count>=p;
    }
}