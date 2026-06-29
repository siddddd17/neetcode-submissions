class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums.sort()
        res = {}
        for i in nums:
            res[i] = res.get(i, 0) + 1
        arr = []
        for i, j in res.items():
            arr.append([j,i])
        arr.sort()
        
        ret = []
        while len(ret)<k:
            ret.append(arr.pop()[1])
        return ret

        


        