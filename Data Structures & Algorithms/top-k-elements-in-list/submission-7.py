class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        ctrMap = {}
        freq = [[] for i in range(len(nums) + 1)]
        for num in nums: 
            ctrMap[num] = ctrMap.get(num, 0 ) + 1
        for num, count in ctrMap.items():
            freq[count].append(num)
        
        res = []
        for i in range(len(nums), 0, -1):
            for num in freq[i]:
                res.append(num)
                if len(res) == k:
                    return res


        


        