class Solution {
    public int pivotIndex(int[] nums) {

        int sum1 = 0,sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0  ; j < nums.length; j++) {
                if(j<i){
                    sum1 = sum1 + nums[j];
                }
                else if(j>i)
                    sum2 = sum2 + nums[j];
            }

            if (sum1 == sum2)
                return i;


        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        Solution solution = new Solution();
        int res = solution.pivotIndex(nums);
        System.out.println(res);
    }
}