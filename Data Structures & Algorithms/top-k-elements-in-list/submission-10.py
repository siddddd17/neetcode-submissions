class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #Bruteforce: use a frequency counter array, index = count, value = number? sort the array, return top k
        #TC: o(n + nlogn)
        #SC: o(n)
        # count = {}
        # for num in nums: 
        #     count[num] = count.get(num,0)+1
        # p = list(count.items())
        # p.sort(key = lambda x: x[1], reverse = True)
        # res = []
        # for i in range(k):
        #     res.append(p[i][0])
        # return res

        #bucket sort, no sorting required
        #TC: o(n)
        #SC: o(n)
        count = {} 
        for num in nums: 
            count[num] = count.get(num, 0) + 1
        freq = [[] for _ in range(len(nums) + 1)]
        for num, count in count.items(): 
            freq[count].append(num)
        res = []
        for i in range(len(freq) - 1, 0 ,  -1):
            for num in freq[i]:
                res.append(num)
                if len(res) == k: 
                    return res; 
        return res;





       


        