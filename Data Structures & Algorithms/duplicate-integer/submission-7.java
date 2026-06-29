class Solution {
    public boolean hasDuplicate(int[] nums) {
        if( nums.length == 0 ){
            return false;
        }
        // Set<Integer> set = new HashSet<Integer>(); //on
        // for(int num : nums){
        //     if(set.contains(num)) return true; 
        //     else set.add(num);
        // }
        // return false; 
        return Arrays.stream(nums).distinct().count()< nums.length; 
    }
}