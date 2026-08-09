public class ShuffleTheArray {
    public static void main(String[] args){

        Solution sol = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = (nums.length)/2;
        int[] ans = sol.shuffle(nums,n);

        for(int val : ans){
            System.out.print(val+" ");
        }
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int k = 0;
        for(int i= 0; i < n; i++){
            ans[k] = nums[i];
            ans[k+1] = nums[n + i];
            k+=2;
        }
        return ans;
    }
}
