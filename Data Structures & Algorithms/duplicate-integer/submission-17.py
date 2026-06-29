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
        # return len(set(nums)) != len(nums)

        #More optimal for sc o(1), use in place sort 
        nums.sort()
        for i in range (len(nums)-1):
            if nums[i] == nums[i+1]: 
                return True
        return False 


#Brute force
#Time complexity : o(n^2)
#Space complexity : o(1)

#Optimal approach 
#TC :  o(n)
#SC : o(n)

#More optimal approach ( use in place sort)

