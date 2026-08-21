// package Easy;
// not working on all test cases; more complex calculations.
// public class SmallestWindowContaining012 {
//     public static void main(String[] args){

//     }
// }
// class Solution {
//     public int smallestSubstring(String s) {
//         // code here
        
//         int l = 0;
//         int r = 2;
//         int min = Integer.MAX_VALUE;
//         boolean found = false;
        
//         while(r < s.length()){
//              String sub = s.substring(l,r+1);
             
//              if(!(sub.contains("0") && sub.contains("1") && sub.contains("2"))){
//                  r++;
//              }else{
//                  found = true;
//                  int length = r-l+1;
//                  if(length == 3){
//                      min = length;
//                      break;
//                  }
//                  min = Math.min(min,length);
//                  l++;
//              }
//         }
//         int result = (found == true) ? min : -1;
//         return result;
//     }
// }


//optimized code :

public class SmallestWindowContaining012{
    public static void main(String[] args){

        
    }
}
