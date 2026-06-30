class Solution {
    public int[] productExceptSelf(int[] nums) {
        // #bruteforce
        // [1,2,4,6]
        // tc: o(n^2)
        // sc: o(1)
        // product = 1
        // product * = j 
        // assign the product to result[i]
        // return result[i]

        // first loop through the entire array , compute the total product
        // total product = x
        // hashmap<integer, integer> index, product ; 
        // loop 2 : result[i] = product / nums[i]
        // tc: o(2n ) -> o(n)
        // sc : o(n)

        // int product =1 ; 
        // int zeroCtr = 0 ; 
        // for(int num : nums){
        //     if (num == 0){
        //         zeroCtr++; 
        //         continue; 
        //     }
        //     product*=num;
        // }
        // if (zeroCtr > 1)
        //     return new int[nums.length];
        
        // int[] result = new int[nums.length];
        // for(int i = 0 ; i < nums.length ; i++){
        //     if (zeroCtr > 0 ){
        //         result[i] = (nums[i] == 0) ? product : 0 ;
        //     }
        //     else result[i] = product / nums[i];
        // }

        // return result; 

        //using prefix suffix
        // [1,2,3,4,5]
        //r[120,60,20,5,1 ]
        //l[1, ,1 , 2,6,24]
        // [120,60,40,30,24]

        int left = 1; 
        int right = 1; 
        int[] result = new int[nums.length];

        for(int i = nums.length -1 ; i >= 0 ; i--){
            result[i] = right; 
            right*= nums[i];
        }

        for(int i = 0 ; i < nums.length; i++){
            result[i]*= left; 
            left*=nums[i];
        }
        return result; 
    }
}  
