class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #o(n2) bruteforce approach 
        # l = len(nums)
        # nums.sort()
        # for i in range(l):
        #     for j in range(i+1, l):
        #         if nums[i] == nums[j]:
        #             return True
        # return False

        #you can use Set for this, o(n)
        return len(set(nums)) != len(nums)



        
#Brute force
#Time complexity : o(n^2)
#Space complexity : o(1)

