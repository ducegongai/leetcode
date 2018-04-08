class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int original_r = nums.length;
        int original_c = nums[0].length;
        if(original_r*original_c == r*c){
            int[][] result = new int[r][c];
            for(int i = 0;i < r*c;i++){
                result[i/c][i%c] = nums[i/original_c][i%original_c];
            }
            return result;
        }
        else{
            return nums;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        Solution solution = new Solution();
        int r = 2;
        int c = 4;
        int[][] result = solution.matrixReshape(nums,r,c);
        if(nums==result){
            r = result.length;
            c = result[0].length;
        }
        for(int i=0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}


