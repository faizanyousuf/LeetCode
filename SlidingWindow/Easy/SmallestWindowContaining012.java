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
class Solution {
    public int smallestSubstring(String s) {
        // code here
        
        int zeroIndex = -1;
        int oneIndex = -1;
        int twoIndex = -1;
        int minLength = Integer.MAX_VALUE;
        boolean found = false;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == '0'){
                zeroIndex = i;
            }else if(ch == '1'){
                oneIndex = i;
            }else{
                twoIndex = i;
            }
            
            if(zeroIndex != -1 && oneIndex != -1 && twoIndex != -1){
                 found = true;
                 int index[] = {zeroIndex,oneIndex,twoIndex};
                 Arrays.sort(index);
                 int length = index[2] -index[0] +1;
                 
                 if(minLength > length){
                     minLength = length;
                 }
            }
        }
         minLength = (found) ? minLength : -1;
        return minLength;
    }
};
