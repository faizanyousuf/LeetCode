import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
public class MissingNumber{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            
        Set<ArrayList<Integer>> set = new HashSet<>();
        // arr.add(new ArrayList<>(Arrays.asList(3,2,5)));
    
        // System.out.println(arr);

        set.add(new ArrayList<>(Arrays.asList(-1,0,1)));
        set.add(new ArrayList<>(Arrays.asList(2,4,4)));
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(0,-1,1));
        // Collections.sort(temp);
        set.add(new ArrayList<>(temp));

        System.out.println(set);

    }
}

class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int sum = (n*(n+1))/2;
        
        int arrSum = 0;
        for(int val : nums){
               arrSum += val;
        }
        int missing = sum-arrSum;
        return missing;
    }
}