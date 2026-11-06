class Solution {
    // tc: o(n*m) + o(nlogn)  = o(m*nlogn)
    // sc: o(n*n)
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String, List<String>> map = new HashMap<>(); 
        // for(String str : strs){
        //     char arr[] = str.toCharArray(); 
        //     Arrays.sort(arr);
        //     map.putIfAbsent(Arrays.toString(arr), new ArrayList<>()); 
        //     map.get(Arrays.toString(arr)).add(str); 
        // }
        // return new ArrayList<>(map.values());

        HashMap<String, List<String>> map = new HashMap<>(); 
        for(String str: strs){
            char[] charArr = new char[26]; 
            for(char ch: str.toCharArray()){
                charArr[ch - 'a']+=1; 
            }
            map.putIfAbsent(Arrays.toString(charArr), new ArrayList<>());
            map.get(Arrays.toString(charArr)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
