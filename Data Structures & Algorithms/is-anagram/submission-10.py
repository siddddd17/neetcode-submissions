class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #Sorted approach 
        #TC : O(nlogn + mlogm)
        #SC : O(n + m )
        # return sorted(s) == sorted(t);

        #More optimal appraoch, instead of sorting we could use a frequency map
        #TC: o(n+m)
        #SC: o(n)
        # if len(s) != len(t):
        #     return False 
        # count = {} 
        # for i in s: 
        #     count[i] = count.get(i, 0) + 1
        
        # for i in t: 
        #     if i not in count or count[i] ==0: 
        #         return False 
        #     count[i]-=1
        # return True

        #Much more optimal approach, use a fixed frequencyu counter arrray if all letters are lower case 
        c = [0]*26
        for i in s:
            c[ord(i) - ord('a')]+=1
        for i in t: 
            c[ord(i) - ord('a')]-=1
        return all(x==0 for x in c)