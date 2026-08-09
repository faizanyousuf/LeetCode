public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2,3,3,5,6,8,8,9,20};
       int ans =  sol.removeDuplicates(arr);

       System.out.println("answer is : "+ans);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        int k = 0;
        for(int i = 0,j= 0;i<nums.length;i++){
            if(arr[i] == false){
                nums[j] = nums[i];
                for(int l = 0;l<nums.length;l++){
                    if(nums[l]== nums[i]){
                        arr[l] =true;
                    }
                }
                j++;
            }
            k = j;
        }

            // int[] result = new int[k];
            // for(int i = 0; i<k; i ++){
            //     expectedNums[i] = nums[i];
            // }
            return k;
        }
        
    }