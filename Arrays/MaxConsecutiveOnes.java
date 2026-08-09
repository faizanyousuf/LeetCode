public class MaxConsecutiveOnes {
    public static void main(String[] args){
       
        int[] nums = {1,1,0,1,1,1,1,0};
        Solution sol = new Solution();
        int ans = sol.findMaxConsecutiveOnes(nums);
        System.out.println("ans: "+ans);
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < length; i++){
            if(nums[i] == 1){
                count +=1;
            }else{
                if(count > max){
                    max = count;
                    count = 0;
                }
                count = 0;
            }
        }
          if(count > max){
                return count;
            }else{
                return max;
            }
    }
}
