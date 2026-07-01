class Solution {
    public int longestConsecutive(int[] nums) {
        //[2,20,4,10,3,4,5]
        //[2,3,4,5] - > 4 
        //brute force
        //ctr = 0 , csc = num : nums ;
        //loop through the nums array ; csc = nums[i] i = 0 ; 
        // check if csc exists in the set 
        // if not exist, break 

        int res = 0 ; 
        int ctr = 0 ; 

        Set<Integer> set = new HashSet<>(); 
        for(int num: nums){
            set.add(num);
        }

        for(int i = 0 ; i < nums.length; i++){
            int curr = nums[i];
            ctr = 0 ; 
            while(set.contains(curr)){
                ctr++; curr++; 
            }
            res = Math.max(res, ctr);
        }

        return res; 
    }
}
