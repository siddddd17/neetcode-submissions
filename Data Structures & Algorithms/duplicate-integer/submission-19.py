class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #bruteforce TC: o(n2) SC : o(1)
        # if len(nums) == 1 or len(nums) == 0 :
        #     return False
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i] == nums[j]:
        #             return True
        # return False
        numset = set()
        for num in nums:
            if num in numset: 
                return True
            numset.add(num)
        return False; 
    
        
        