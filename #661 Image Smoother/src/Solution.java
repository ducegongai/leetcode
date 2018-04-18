class Solution {
    public int[][] imageSmoother(int[][] M) {
        int sum = 0;
        int count = 0;
        int[][] res =new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for(int j = 0;j < M[0].length ; j++){
                sum = 0;
                count = 0;
                if(j-1 >=0){
                    if(i-1>=0){
                        sum = sum + M[i-1][j-1];
                        count++;
                    }
                    if(i+1<M.length){
                        sum = sum + M[i+1][j-1];
                        count++;
                    }
                    count++;
                    sum = sum + M[i][j-1];
                }
                if(j+1 < M[0].length){
                    if(i-1>=0){
                        sum = sum + M[i-1][j+1];
                        count++;
                    }
                    if(i+1 < M.length){
                        sum = sum + M[i+1][j+1];
                        count++;
                    }
                    sum = sum + M[i][j+1];
                    count++;
                }
                if(i-1>=0){
                    sum = sum + M[i-1][j];
                    count++;
                }
                if(i+1<M.length){
                    sum = sum + M[i+1][j];
                    count++;
                }
                count++;
                sum = sum + M[i][j];
                //System.out.println("sum = "+sum+" "+"count = "+count);
                res[i][j] =  sum/count;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] M = {{1,2,3},{4,5,6},{7,8,9}};
        int m = M.length;
        int n = M[0].length;

        Solution solution = new Solution();
        int[][] res = solution.imageSmoother(M);
        for (int i = 0; i <M.length ; i++) {
            for(int j = 0;j<M[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }
    }
}