public class PivotIndex{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
         int suffix = 0;
         int prefix = 0;
        for(int i = 0; i < nums.length; i++){
            suffix += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            suffix -= nums[i];
            if(prefix == suffix){
                pivotIndex = i;
                break;
            }
            prefix += nums[i];
        }
        return pivotIndex;
    }
}