public class RemoveDupicatesFromSortedArray26{
    public static void main(String[] args){

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        
         int j = 0;
        for(int i = 0; i < nums.length;i++){
              if(nums[i] == nums[j]){

              }else{
                j++;
                nums[j] = nums[i];
              }
            //   nums[j] = nums[i-1];
        }
        return j+1;
    }
}