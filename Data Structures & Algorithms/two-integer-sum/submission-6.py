class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #bruteforce approach : use nesting
        #TC: o(n2) 
        #SC: o(1)
        # for i in range(len(nums)):
        #     for j in range (i+1, len(nums)):
        #         if nums[i] + nums[j] == target: 
        #             return [i, j]
        # return []

        #Better approach : target - current index = second number 
        #Check if that exists in the hashmap, else add it 
        #TC: o(n)
        #SC: o(n)
        c = {}
        for i in range(len(nums)):
            if target - nums[i] in c:
                return [c[target-nums[i]], i]
            else : 
                c[nums[i]] = i
        return []




        