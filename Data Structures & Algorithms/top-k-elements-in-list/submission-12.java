class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap<Integer, Integer> counter = new HashMap<>(); 
        // for(int num: nums){
        //     counter.put(num, counter.getOrDefault(num, 0)+1); 
        // }

        // List<int[]> arr = new ArrayList<>(); 
        // for(Map.Entry<Integer, Integer> entry: counter.entrySet()){
        //     arr.add(new int[]{entry.getValue(), entry.getKey()});
        // }
        // arr.sort((a,b) -> b[0] - a[0]);

        // int[] res = new int[k]; 
        // for(int i = 0 ; i<k ; i++){
        //     res[i] = arr.get(i)[1]; 
        // }

        // return res;    

        HashMap<Integer, Integer> counter = new HashMap<>(); 
        for(int num: nums){
            counter.put(num, counter.getOrDefault(num, 0)+1); 
        }    

        List<Integer>[] freq = new List[nums.length + 1]; 
        for(int i = 0 ; i< freq.length; i++){
            freq[i] = new ArrayList<>(); 
        }

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k]; 
        int index = 0; 
        for(int i = freq.length - 1; i >= 0; i--){
            for(int n: freq[i]){
                res[index++] = n; 
                if(index == k ) return res; 
            }
        }
        return res; 
    }
}
