class Solution {
    public boolean isAnagram(String s, String t) {
        //tc: o(nlogn + mlogm)
        //sc: o(1)
        // if (s.length() != t.length()) return false; 
        // char[] sArr = s.toCharArray(); //o(n)
        // char[] tArr = t.toCharArray(); //o(m)
        // Arrays.sort(sArr); Arrays.sort(tArr); //o(nlogn)
        // return Arrays.equals(sArr, tArr); //o(n)

        HashMap<Character, Integer> counterS = new HashMap<>();
        HashMap<Character, Integer> counterT = new HashMap<>(); 
 
        for(char ch: s.toCharArray()){
            counterS.put(ch, counterS.getOrDefault(ch, 0) + 1);
        }
        for(char ch: t.toCharArray()){
            counterT.put(ch, counterT.getOrDefault(ch, 0) + 1 ) ; 
        }

        return counterS.equals(counterT);
    }
}
