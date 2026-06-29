
        // 1. loop through the string arrays 
        // 2. for each string in the array : -> covert them to char Array 
        //                                   -> using an array frequency counter, 
        //                                      generate a frequency footprint
        //                                   -> store the frequency footprint as key and the string as a list of values 
        //                                         in a hashmap
        //                                   -> keep on iterating till the last string in the array 
        //                                   -> hashmap : key (int[]), value List<Strings> 
        //                                   -> now add all the contents of a hashmap into a parent array and return the array 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] strArr = str.toCharArray();
            addToMap(map, str, strArr);
        }

        return new ArrayList<>(map.values());
    }

        public void addToMap(Map<String , List<String>> map, String str, char[] strArr){ 
            int[] freqFootprint = new int[26];
            for (char ch : strArr)
                freqFootprint[ch - 'a']++; 
            
            String freqStr = Arrays.toString(freqFootprint); 
            if (!map.containsKey(freqStr)){
                map.put(freqStr, new ArrayList<>());
            }
            map.get(freqStr).add(str);
        }
}
