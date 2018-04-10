class Solution {
    public static int count = 0;

    public static void checkAround(int nums[][], int i, int j) {
        if (nums[i][j] != 0) {
            nums[i][j] = 0;
            count++;
            if (i + 1 <nums.length)
                checkAround(nums, i + 1, j);
            if (j + 1 < nums[0].length)
                checkAround(nums, i, j + 1);
            if (i - 1 >= 0)
                checkAround(nums, i - 1, j);
            if (j - 1 >= 0)
                checkAround(nums, i, j - 1);
        }
    }



    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
               checkAround(grid, i, j);
                if (count > max)
                    max = count;
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
//                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] grid = {{0,1},{1,1}};
        Solution solution = new Solution();
        int max = solution.maxAreaOfIsland(grid);
        System.out.println(max);
    }
}