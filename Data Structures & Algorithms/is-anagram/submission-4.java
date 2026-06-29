class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false; 

        //tc: o(mlogm + onLogN)
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr); 
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr); 
    }
}


// sort and compare ( onlogn o 1)
// frequency counter ( o (n) (o n ))
// hashmap counter  ( o n , o n )
// 2 pointers ? 