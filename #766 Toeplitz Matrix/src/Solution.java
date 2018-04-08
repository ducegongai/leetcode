class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i,j;

        for (j = 0; j < n; j++) {
            i = 0;
            int a = i;
            int b = j;
            while((a + 1 < m )&& (b + 1 < n)){

                if(matrix[a+1][b+1] != matrix[a][b]){
                    return false;
                }

                a++;
                b++;
            }
        }

        for (i = 0; i < m ; i++) {
            j = 0;
            int a = i;
            int b = j;
            while((a+1<m) && (b+1<n)){
                if(matrix[a][b] != matrix[a+1][b+1])
                    return false;
                a++;
                b++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,3,3},{9,5,1,2}};
        Solution solution = new Solution();
        boolean res = solution.isToeplitzMatrix(matrix);
        System.out.println(res);
    }
}