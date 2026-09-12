public class FindDuplicateNumber {
    
}

class Solution {
    public int findDuplicate(int[] nums) {
         int result = -1;
        int [] arr = new int[nums.length-1];

        for(int i = 0; i < nums.length; i++){
             
             arr[nums[i]-1]++;
        }

      for(int i = 0; i < arr.length; i++){
           if(arr[i] > 1){
                return i+1;
           }
      }
        return result;
    }
}