class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); 
        for(String str : strs){
            char arr[] = str.toCharArray(); 
            Arrays.sort(arr);
            if(map.containsKey(Arrays.toString(arr))){
                map.get(Arrays.toString(arr)).add(str);
            }
            else{ 
                List<String> list = new ArrayList<>(); 
                list.add(str); 
                map.put(Arrays.toString(arr), list);

            }
        }
        return new ArrayList<>(map.values());
    }
}
