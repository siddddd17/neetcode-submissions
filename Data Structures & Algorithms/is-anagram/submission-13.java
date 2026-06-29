class Solution {
    //tc: o(n + m), sc : o(1)
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false ; 
    //     HashMap<Character, Integer> sMap = new HashMap(); 
    //     HashMap<Character, Integer> tMap = new HashMap(); 
    
    //     for (int i = 0 ; i < s.length(); i++)
    //         sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1 ) ; 
        
    //     for (int i = 0 ; i <t.length(); i++)
    //         tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1 ) ; 
        
    //     return sMap.equals(tMap); 
    // }

    //use frequency counter using arrays 
    //create a freq counter array containing all zeros, ++ all the characters of s in the array , -- all the characters of t in the array 
    //in the final loop, if any element in the array != 0 , then both are not anagrams 
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false ; 
        int[] arr = new int[26]; 

        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++; 
            arr[t.charAt(i) - 'a']--; 
        }

        for(int i : arr){
            if (i != 0 ) return false; 
        }
        return true;
    }
}
