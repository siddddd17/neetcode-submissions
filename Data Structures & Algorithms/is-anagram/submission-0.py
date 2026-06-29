class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #Sort and compare o nlogn + o mlogm , 
        if len(s) != len(t):
            return False
        else :
            if sorted(s) == sorted (t):
                return True
        return False
        