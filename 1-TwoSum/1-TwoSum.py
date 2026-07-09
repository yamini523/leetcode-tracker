# Last updated: 7/9/2026, 10:08:16 AM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]


# Example usage
sol = Solution()
result = sol.twoSum([-3, 4, 3, 90], 0)
print(result)
