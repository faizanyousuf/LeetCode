package MediumLeetCode;

public class SearchInRotatedArray {
}

class Solution {
    public int search(int[] nums, int target) {
        int k = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                k = i;
                break;
            }
        }
        int index = -1;
        if(target >= nums[0] && target <= nums[k]){
            int low = 0;
            int high = k;
            while(low <= high){
                int mid = (low + high)/2;

                if(nums[mid] == target){
                    index = mid;
                    break;
                }else if(nums[mid] < target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }else{
            int low = k+1;
            int high = nums.length-1;

            while(low <= high){
                int mid = (low + high)/2;

                if(nums[mid] == target){
                    index = mid;
                    break;
                }else if(nums[mid] < target){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }

        }
        return index;
    }
}