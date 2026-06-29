class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #Bruteforce: use a frequency counter array, index = count, value = number? sort the array, return top k
        #TC: o(n + nlogn)
        #SC: o(n)
        count = {}
        for num in nums: 
            count[num] = count.get(num,0)+1
        p = list(count.items())
        p.sort(key = lambda x: x[1], reverse = True)
        res = []
        for i in range(k):
            res.append(p[i][0])
        return res

       


        