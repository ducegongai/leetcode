class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max_len = 0,temp_length = 0;
        if(nums.length == 0)
            return 0;
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j]<nums[j+1]){
                temp_length++;
                if(temp_length>max_len)
                    max_len = temp_length;

            }
            else
                temp_length = 0;

        }
        return max_len+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        Solution solution = new Solution();
        int res = solution.findLengthOfLCIS(nums);
        System.out.println(res);
    }
}