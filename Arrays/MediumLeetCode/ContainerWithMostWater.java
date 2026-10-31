package MediumLeetCode;

public class ContainerWithMostWater {
}

class Solution {
    public int maxArea(int[] height) {

        //  int maxWater = Integer.MIN_VALUE;
        // for(int i = 0; i < height.length-1; i++){

        //     for(int j = i+1; j < height.length;j++){
        //         int lineHeight = Math.min(height[i],height[j]);
        //         int length = j-i;
        //         int water = lineHeight*length;
        //         if(water > maxWater){
        //             maxWater = water;
        //         }
        //     }
        // }
        // return maxWater;


        // two pointer approach

        int l = 0;
        int r = height.length-1;

        int maxWater = Integer.MIN_VALUE;

        while(l <= r){

            int length = r-l;
            int lineHeight = Math.min(height[l], height[r]);
            int water = length*lineHeight;

            if(maxWater < water){
                maxWater = water;
            }

            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}
