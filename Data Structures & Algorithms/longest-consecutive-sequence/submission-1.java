class Solution {
    public int longestConsecutive(int[] nums) {
        //[2,20,4,10,3,4,5]
        //[2,3,4,5] - > 4 
        //brute force tc: o(n^2), sc : o(n)
    //     int res = 0 ; 
    //     int ctr = 0 ; 

    //     Set<Integer> set = new HashSet<>(); 
    //     for(int num: nums){
    //         set.add(num);
    //     }

    //     for(int i = 0 ; i < nums.length; i++){
    //         int curr = nums[i];
    //         ctr = 0 ; 
    //         while(set.contains(curr)){
    //             ctr++; curr++; 
    //         }
    //         res = Math.max(res, ctr);
    //     }

    //     return res; 
    // }

    //better approach 
    //sort nums O(nlogn)
    //iterate through nums once , use ctr and check o(n)
    // tc: o(nlogn + n ) -> o(nlogn)
    // sc : o(1)

    if(nums.length == 0 ) return 0 ;  
    Arrays.sort(nums);

    int ctr= 0 ; int res = 0 ; int i = 0 ; int curr = nums[0]; 

    while(i < nums.length){
        //if the sequence breaks, reset the ctr
        if(curr != nums[i]){
            curr = nums[i]; 
            ctr = 0 ; 
        }
        //incase of duplicate numbers, skip them 
        while(i < nums.length && nums[i] == curr){
            i++; 
        }
        ctr++; curr++; 
        res = Math.max(res, ctr);
    }
    
    return res; 
    }
}
