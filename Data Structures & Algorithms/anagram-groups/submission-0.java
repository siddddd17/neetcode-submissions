class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for ( String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            String countstr = Arrays.toString(count);
            res.putIfAbsent(countstr, new ArrayList<>());
            res.get(countstr).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
