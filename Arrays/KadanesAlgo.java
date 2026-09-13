class Solution {
    public int maxSubArray(int[] nums) {

        //brute force approach 

        // int subSum = Integer.MIN_VALUE;;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i;j < nums.length; j++){
        //           sum += nums[j];
        //           if(sum > subSum){
        //             subSum = sum;
        //           }
        //     }
        // }
        // return subSum;


        //kadan's Algorithm 

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
        
    }
}