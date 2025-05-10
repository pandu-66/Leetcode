class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        maxsum = sum(nums[:k])
        currsum = maxsum
        for i in range(k, len(nums)):
            currsum += nums[i] - nums[i-k]
            maxsum = max(currsum, maxsum)
        return float(maxsum)/k