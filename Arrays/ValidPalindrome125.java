    public class ValidPalindrome125{
        public static void main(String[] args){


        }
    }
    class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= 122 && s.charAt(i) >= 97 || s.charAt(i) <= 57 && s.charAt(i) >= 48){
                sb.append(s.charAt(i));
            }
        }
        // System.out.print(sb);
        boolean isPalindrome = true;
        int i = 0;
        int j = sb.length()-1;
        while(i < j){
            if(sb.charAt(i) == sb.charAt(j)){
                i++;
                j--;
            }else{
                isPalindrome = false;
                break;
            }
        }
            return isPalindrome;
    }
}