public class LongestCommonPrefix{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minIndex = 0;
        for(int i = 0; i < strs.length; i++){
            int length = strs[i].length();
            if(length < strs[minIndex].length()){
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        String prefix = "";
        String str = strs[minIndex];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean isPrefix = true;
            for(int j = 0; j < strs.length; j++){
                if(ch != strs[j].charAt(i)){
                isPrefix = false;
                break;
                }
            }
            if(isPrefix){
                prefix += ch;
            }else{
                break;
            }
        }
        return prefix;
    }
}