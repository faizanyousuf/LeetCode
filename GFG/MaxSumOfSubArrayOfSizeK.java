

public class MaxSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i <= arr.length-k; i++){
        //     int j = i+k-1;
        //     int sum = 0;
        //     for(int l = 0; l < k; l++){
        //         sum += arr[i+l];
        //     }
        //     if(maxSum < sum){
        //         maxSum = sum;
        //     }
        // }
        int sum = 0;
        int l = 0;
        int r = l+k-1;
        for(int i = 0; i < k; i++){
            sum += arr[i];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        
        while(r != arr.length-1){
            sum = sum -arr[l];
            l++;
            r++;
            sum = sum +arr[r];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
