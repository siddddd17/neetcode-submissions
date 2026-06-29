class Solution {
    //generate a hashmap 
    //count all the elements from the array 
    // iterate through the hashmap 
    //select all the elements where freq > = k and add them to an array 
    // return the array 
    //total tc : o(n) + o(n)  = o(n)
    //totcal sc : o(n) for the hashmap + o(n) for the array; o(n)
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for(int i  =  0 ; i < list.length; i++)
            list[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            list[entrySet.getValue()].add(entrySet.getKey());
        } 

        int[] res = new int[k];
        int index = 0; 
        for(int i = list.length -1 ; i > 0 && index < k ; i --){
            for(int n : list[i]){
                res[index++] = n; 
                if(index == k ) return res; 
            }
        }
        return res; 
    }
}
