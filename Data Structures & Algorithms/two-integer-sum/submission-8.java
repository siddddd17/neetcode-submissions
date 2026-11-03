class Solution {
    public int[] twoSum(int[] nums, int target) {
        //bruteforce
        //tc: o(n^2)
        //sc: o(1); 
        // for(int i = 0 ; i < nums.length; i++){
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target)
        //             return new int[]{i, j};
        //     }
        // }
        // return new int[]{0,0};

        //tc: o(n)
        //sc: o(n);
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            int num = nums[i]; 
            int diff = target - num; 
            if (map.containsKey(diff)) 
                return new int[]{map.get(diff), i}; 
            map.put(num , i); 
        }
        return new int[]{}; 

    }
}
