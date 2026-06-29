class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>((int) (nums.length / 0.75f) + 1);
        for (int num: nums){
            if(!numSet.add(num))
                return true; 
        }
        return false; 
    }
}