class Solution {
    public void sortColors(int[] nums) {
        
            int k = 0;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                   swap(nums,i,k);
                   k++;
                }
            }

            for(int i = k; i < nums.length; i++){
                if(nums[i] == 1){
                    swap(nums,i,k);
                    k++;
                }
            }

    }

    void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}