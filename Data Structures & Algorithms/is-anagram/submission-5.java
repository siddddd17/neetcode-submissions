class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false; 

        // //tc: o(mlogm + onLogN)
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();
        // Arrays.sort(sArr); //mlogm
        // Arrays.sort(tArr); //nlogn
        // return Arrays.equals(sArr, tArr); o ( m + n ) 
        // // total tc : o(m + n) * (mlogm + nLogn) = o(mlogm + nlogn)
        // // total sc : m + n 

        //hashmap: sc : o(1) , tc : o(m + n)
        // Map<Character, Integer> map1 = new HashMap<>();  
        // Map<Character, Integer> map2 = new HashMap<>();

        // for( int i = 0 ; i < s.length() ; i++){
        //     map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1); //o(m)
        //     map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1); //o(n)
        // }
        // return map1.equals(map2); 

        //other approach usign hashtables
        int counter[] = new int[26]; 
        for (int i = 0 ; i < s.length(); i ++){
            counter[s.charAt(i) - 'a']++; 
            counter[t.charAt(i) - 'a']--; 
        }
        for(int i = 0 ; i < counter.length; i ++){
            if(counter[i] != 0) return false; 
        }
        return true;
    }
}


// sort and compare ( onlogn o 1)
// frequency counter ( o (n) (o n ))
// hashmap counter  ( o n , o n )
// 2 pointers ? 