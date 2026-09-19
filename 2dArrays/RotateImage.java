public class RotateImage {

}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                st.push(matrix[j][i]);
            }
        }

        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                matrix[i][j] = st.pop();
            }
        }
    }
}