class Solution {
    public int majorityElement(int[] nums) {
        //frequency array 
        // 1. iterate through the array 
        // 2. store the frequency count of each element to the index of the feq counter
        // 3. iterate thorugh the counter. select the max 
        // tc: o(n + n) ~ o(n)
        // sc : o(n)

        //hashmap 
        // 1.create a hashmap based frequency counter , Key = number, value = frequency
        //2. iterate thorugh the arraay, fill in the hashmap 
        //3. iterate through the hashmap, choose the number with the highest count 
        //tc: on , sc : on 

        //sorting 
        //given that max occurence = n/2
        //sort the array, choose the number at n/2 index, it would be the highest 
        // tc : o(nlogn), sc : o(1)

        //boyre moores algorithm 
        // int count = 0 , res = 0 ; 
        // for(int num: nums){
        //     if (count == 0 ){
        //         res = num; 
        //     }
        //     count += (res == num ) ? 1 : -1; 
        // }
        // return res;
        //total tc (on ), sc : o(1)
        //randomization
        // assumtion, since the majority element occurs more than n/2 , we can choose a random pointer which most probably would land on a majority element 
        
        Random rand = new Random(); 
        int n = nums.length ; 
        while(true){
            int random = nums[rand.nextInt(n)];
            int count =0 ; 
            for(int num : nums){
                if(num == random) count++; 
            }
            if(count > n/2) return random; 
        }
    }
}