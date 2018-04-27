class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE,sum = 0;
        if(nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i],sum+nums[i]);
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums =   {-1};
        Solution solution = new Solution();
        int res = solution.maxSubArray(nums);
        System.out.println(res);
    }

}