class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        int res = 0, max = 0;
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > max){
                res = num;
                max = map.get(num);
            }
        }
        return res;

    }
}