class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        if len(set(nums)) < len(nums):
            return True
        return False

        
#Brute force
#Time complexity : o(n^2)
#Space complexity : o(1)

