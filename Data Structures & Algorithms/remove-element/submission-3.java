class Solution {
    public int removeElement(int[] nums, int val) {
        // int k = 0 ; 
        // for ( int i = 0 ; i < nums.length; i ++){
        //     if(nums[i]!= val){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k ;


        //bruteforce 
        //1. iterate through the array //(on ) 
        // 2. when arr[i] == val, drop it and left shift other elements (on)
        //total tc : o(n), total sc : o(1)

        //other approach ( fast and slow pointers ) 
        //1. iterate through the array 
        // [1, 1, 2, 3, 4 ]
        //        k arr[k] = arr[i];
        //        i 
            
        // tc: o(n)
        // sc : o(1)
        
        int k = 0; 
        for( int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                nums[k] = nums [i];
                k++;
            }
        }
        return k; 
    }

}